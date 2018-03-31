package com.netty.zerocopy;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NewServer {
    public static void main(String[] args) throws Exception {
        InetSocketAddress address = new InetSocketAddress(8899);
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket socket = serverSocketChannel.socket();
        socket.setReuseAddress(Boolean.TRUE);
        socket.bind(address);

        ByteBuffer buffer = ByteBuffer.allocate(4096);

        while (Boolean.TRUE){
            SocketChannel socketChannel  = serverSocketChannel.accept();
            socketChannel.configureBlocking(Boolean.TRUE);
            int readCount = 0;
            while (-1 != readCount){
               readCount = socketChannel.read(buffer);
               buffer.rewind();
            }
        }
    }
}
