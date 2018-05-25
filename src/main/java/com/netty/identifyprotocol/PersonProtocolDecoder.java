package com.netty.identifyprotocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class PersonProtocolDecoder extends ReplayingDecoder<Void> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        System.out.println("Person protocol decoder invoked!");

        //这里的读取顺序要与编码器Encoder中的写入顺序对应.
        //编码器Encoder中先写入的是int类型的数据，就先读取int
        //否则解码器Decoder会识别不出来消息
        int contentLength = in.readInt();
        byte[] content = new byte[contentLength];

        PersonProtocol protocol = new PersonProtocol();
        protocol.setContentLength(contentLength);
        protocol.setContent(content);

        out.add(protocol);
    }
}
