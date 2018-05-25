package com.netty.identifyprotocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class PersonProtocolEncoder extends MessageToByteEncoder<PersonProtocol> {
    @Override
    protected void encode(ChannelHandlerContext ctx, PersonProtocol msg, ByteBuf out) throws Exception {

        System.out.println("Person protocol encoder invoked! ");

        int contentLength = msg.getContentLength();
        byte[] content = msg.getContent();

        //这里的写入顺序要与解码器Decoder中的读取顺序顺序对应
        //解码器Encoder中先读取的是int类型的数据，就要先写入int
        //否则解码器Decoder会识别不出来消息
        out.writeInt(contentLength);
        out.writeBytes(content);


    }
}
