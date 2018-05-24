package com.netty.TCPPackageAndUnpackage;

import com.netty.codec.ByteToLongReplayingDecoder;
import com.netty.codec.LongToByteEncoder;
import com.netty.codec.LongToStringDecoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;


public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new ServerHandler());
    }
}
