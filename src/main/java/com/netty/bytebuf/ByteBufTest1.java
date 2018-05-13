package com.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

public class ByteBufTest1 {
    public static void main(String[] args) {
        ByteBuf buffer = Unpooled.copiedBuffer("张hello world", Charset.forName("utf8"));

        if (buffer.hasArray()){
            byte[] content = buffer.array();

            System.out.println(new String(content, Charset.forName("utf8")));

            System.out.println(buffer);

            System.out.println(buffer.arrayOffset());
            System.out.println(buffer.readerIndex());
            System.out.println(buffer.writerIndex());
            System.out.println(buffer.capacity());

            int length = buffer.readableBytes();
            System.out.println(length);

            for (int i = 0; i < buffer.readableBytes(); i++){
                System.out.println((char)buffer.getByte(i));
            }

            System.out.println(buffer.getCharSequence(0, 4, Charset.forName("utf8")));

            buffer.clear();

            System.out.println((char)buffer.getByte(6));

        }

    }
}
