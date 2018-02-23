package com.netty.nio;

import java.nio.ByteBuffer;

/**
 * 类型化Buffer
 *
 */
public class NioTest5 {
    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(64);

        buffer.putInt(10);
        buffer.putLong(50000000000000L);
        buffer.putDouble(9.99);
        buffer.putChar('w');
        buffer.putShort((short)1);
        buffer.putChar('你');

        buffer.flip();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
        System.out.println(buffer.getChar());

    }
}
