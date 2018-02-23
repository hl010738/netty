package com.netty.nio;

import java.nio.ByteBuffer;

/**
 * Buffer分片 slice
 * slice buffer 和 原有的 buffer 共享底层数据
 */
public class NioTest6 {

    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(10);

        for (int i = 0; i < b.capacity(); i++){
            b.put((byte)i);
        }
        
        b.position(2);
        b.limit(7);

        ByteBuffer slice = b.slice();

        for (int i = 0; i < slice.capacity(); i++){
            byte c = slice.get();
            slice.put(i, (byte)(c * 2));
        }

        b.position(0);
        b.limit(b.capacity());

        while (b.hasRemaining()){
            System.out.println(b.get());
        }
    }
}
