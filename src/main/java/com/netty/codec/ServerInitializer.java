package com.netty.codec;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;


public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();

        //pipeline.addLast(new ByteToLongDecoder());
        pipeline.addLast(new ByteToLongReplayingDecoder());
        pipeline.addLast(new LongToStringDecoder());
        pipeline.addLast(new LongToByteEncoder());
        pipeline.addLast(new ServerHandler());
    }
}
