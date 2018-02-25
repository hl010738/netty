package com.netty.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


/**
 * mapped byte buffer 内存映射文件
 */
public class NioTest9 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src\\main\\java\\com\\netty\\nio\\NioTest9.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        //将文件的第0个字节开始，映射5个字节的长度的内容映射到内存中, 这里的内存为堆外内存
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

        //将内存中的相应位置的内容替换
        mappedByteBuffer.put(0, (byte)'a');
        mappedByteBuffer.put(3, (byte)'b');

        randomAccessFile.close();
    }
}
