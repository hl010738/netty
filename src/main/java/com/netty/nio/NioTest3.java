package com.netty.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\java\\com\\netty\\nio\\NioTest3.txt");
        FileChannel channel = fileOutputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(512);
        byte[] bytes = "Hi, nihao I Love you".getBytes();

        for (int i = 0; i < bytes.length; i++){
            buffer.put(bytes[i]);
        }

        buffer.flip();

        channel.write(buffer);
        fileOutputStream.close();

    }
}
