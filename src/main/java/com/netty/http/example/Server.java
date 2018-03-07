package com.netty.http.example;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Server {

    public static void main(String[] args) throws InterruptedException {

        //一般可以认为bossGroup或者parentGroup只是在服务器端管理来自客户端的链接
        //一旦连接建立之后，会将连接pass给workerGroup或者childGroup进行具体的数据处理
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            //Handler方法是针对 bossGroup 处理的，也就是说如果客户端连接进来的时候需要处理，则在handler中指定相应的Initiallizer
            //childHandler 则是针对 workderGroup的，当连接建立好后需要进行处理时，则在childHandler中指定相应的Initiallizer
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class).childHandler(new ServerInitializer());

            ChannelFuture future = serverBootstrap.bind(8899).sync();
            future.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }
}
