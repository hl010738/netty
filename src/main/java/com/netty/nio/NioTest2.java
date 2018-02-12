package com.netty.nio;


import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\com\\netty\\nio\\NioTest2.txt");
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(512);
        channel.read(buf);

        buf.flip();

        while (buf.remaining() > 0){
            System.out.println((char) buf.get());
        }

        fileInputStream.close();
    }
}
