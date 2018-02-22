package com.netty.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * File Channel
 * 文件通道
 */
public class NioTest4 {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\com\\netty\\nio\\input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\java\\com\\netty\\nio\\output.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true){
            buffer.clear();
            int number = inputChannel.read(buffer);

            System.out.println("read: " + number);

            if (-1 == number){
                break;
            }

            buffer.flip();

            outputChannel.write(buffer);
        }

        inputChannel.close();
        outputChannel.close();
    }
}
