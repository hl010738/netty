package com.netty.nio;

import java.nio.ByteBuffer;

/**
 * Read only buffer
 */
public class NioTest7 {

    public static void main(String[] args) {

        ByteBuffer b = ByteBuffer.allocate(10);

        for (int i = 0; i < b.capacity(); i++){
            b.put((byte)i);
        }

        ByteBuffer readOnlyBuffer = b.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());
    }
}
