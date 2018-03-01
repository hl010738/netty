package com.netty.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * selector 一个服务器线程处理多个客户端连接
 * NIO 网络编程
 */
public class NioTest12 {

    public static void main(String[] args) throws IOException {
        int[] port = new int[5];

        port[0] = 5000;
        port[1] = 5001;
        port[2] = 5002;
        port[3] = 5003;
        port[4] = 5004;

        Selector selector = Selector.open();

        for (int i = 0; i < port.length; i++){
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            ServerSocket serverSocket = serverSocketChannel.socket();
            InetSocketAddress address = new InetSocketAddress(port[i]);
            serverSocket.bind(address);

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("监听端口: " + port[i]);
        }

        while (true){
            int number = selector.select();
            System.out.println("numbers: " + number);

            Set<SelectionKey> selectedKeys = selector.selectedKeys();

            System.out.println("selectionKeys: " + selectedKeys);

            Iterator<SelectionKey> iter = selectedKeys.iterator();

            while (iter.hasNext()){
                SelectionKey key = iter.next();

                if(key.isAcceptable()){

                    //这里是因为上面注册为accept状态的是ServerSocketChannel
                    // 所以强制类型转换为ServerSocketChannel
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel)key.channel();

                    SocketChannel socketChannel = serverSocketChannel.accept();

                    socketChannel.configureBlocking(Boolean.FALSE);

                    socketChannel.register(selector, SelectionKey.OP_READ);

                    //事件处理完需要remove，否则连接会再进到这里而报错
                    iter.remove();

                    System.out.println("获取客户端连接: " + socketChannel);
                }else if (key.isReadable()){
                    //这里是因为注册为readable状态的是SocketChannel
                    //所以强制类型转换为SocketChannel
                    SocketChannel socketChannel = (SocketChannel)key.channel();

                    int readByte = 0;

                    while (Boolean.TRUE){
                        ByteBuffer buffer = ByteBuffer.allocate(512);

                        buffer.clear();

                        int read = socketChannel.read(buffer);
                        if (read <= 0){
                            break;
                        }

                        buffer.flip();

                        socketChannel.write(buffer);

                        readByte += read;
                    }

                    System.out.println("读取: " + readByte + "来自于: " + socketChannel);

                    //事件处理完需要remove
                    iter.remove();
                }
            }
        }
    }
}
