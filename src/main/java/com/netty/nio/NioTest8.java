package com.netty.nio;

import java.nio.ByteBuffer;

/**
 * Direct Buffer 直接缓冲
 */
public class NioTest8 {
    public static void main(String[] args) {

        ByteBuffer b = ByteBuffer.allocateDirect(10);

        for (int i = 0; i < b.capacity(); i++){
            b.put((byte)i);
        }

        ByteBuffer readOnlyBuffer = b.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());
    }
}
