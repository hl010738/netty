package com.netty.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * Scattering 和 Gathering
 */
public class NioTest11 {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(8899);
        serverSocketChannel.socket().bind(address);


        int messageLength = 2 + 3 + 4;

        ByteBuffer[] byteBuffer = new ByteBuffer[3];
        byteBuffer[0] = ByteBuffer.allocate(2);
        byteBuffer[1] = ByteBuffer.allocate(3);
        byteBuffer[2] = ByteBuffer.allocate(4);

        SocketChannel socketChannel = serverSocketChannel.accept();

        while (true){
            int byteRead = 0;

            while (byteRead < messageLength){
                long r = socketChannel.read(byteBuffer);
                byteRead += r;

                System.out.println("byteRead: " + byteRead);
                Arrays.asList(byteBuffer).stream().map(buffer -> "position: " + buffer.position() + " limit: " + buffer.limit())
                        .forEach(System.out::println);
            }

            Arrays.asList(byteBuffer).forEach(buffer -> buffer.flip());

            int byteWritten = 0;

            while (byteWritten < messageLength){
                long r = socketChannel.write(byteBuffer);
                byteWritten += r;
            }
            Arrays.asList(byteBuffer).stream().forEach(buffer -> buffer.clear());

            System.out.println("byteRead: " + byteRead + " byteWritten: " + byteWritten + " messageLength: " + messageLength);
        }
    }
}
