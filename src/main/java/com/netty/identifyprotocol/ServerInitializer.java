package com.netty.identifyprotocol;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;


public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new PersonProtocolDecoder());
        pipeline.addLast(new PersonProtocolEncoder());
        pipeline.addLast(new ServerHandler());
    }
}
