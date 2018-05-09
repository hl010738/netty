package com.netty.chat.example;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ServerHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.forEach(c -> {
            if(channel != c){
                c.writeAndFlush(channel.remoteAddress() + " 发送消息: " + msg + "\n");
            } else {
                c.writeAndFlush("自己发的消息: " + msg + "\n");
            }
        });
    }



    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        /**
         *
         这里的代码是：如果此服务端接收到客户端发送过来的消息，然后再转发到其他的服务器时
         不应new一个新的eventLoop，应该使用当前的eventLoop.


        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(ctx.channel().eventLoop());
         */
        System.out.println(channel.remoteAddress() + " 上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + " 下线");
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("Server: " + channel.remoteAddress() + " 已上线\n");
        channelGroup.add(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("Server: " + channel.remoteAddress() + " 已下线\n");

        //netty会自动移除下线的channel, 无需手动移除
        //channelGroup.remove(channel);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
