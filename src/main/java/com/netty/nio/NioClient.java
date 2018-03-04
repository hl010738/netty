package com.netty.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * NIO 网络编程
 * 多个客户端同时绑定到一个端口
 */
public class NioClient {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(Boolean.FALSE);

            Selector selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
            InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8899);
            socketChannel.connect(socketAddress);

            while (Boolean.TRUE){
                //select 方法是阻塞的，对方还没有返回信息，一旦返回则开始执行下面的处理逻辑
                selector.select();
                Set<SelectionKey> keySet = selector.selectedKeys();

                for (SelectionKey key : keySet){
                    if(key.isConnectable()){
                        SocketChannel client = (SocketChannel) key.channel();

                        if (client.isConnectionPending()){
                            client.finishConnect();
                            ByteBuffer buffer = ByteBuffer.allocate(1024);
                            buffer.put((LocalDateTime.now() + "连接成功").getBytes());
                            buffer.flip();
                            client.write(buffer);

                            ExecutorService executorService = Executors.newSingleThreadExecutor(Executors.defaultThreadFactory());
                            executorService.submit(() -> {
                                while (Boolean.TRUE){
                                    buffer.clear();
                                    InputStreamReader reader = new InputStreamReader(System.in);
                                    BufferedReader br = new BufferedReader(reader);
                                    try {
                                        String message = br.readLine();

                                        buffer.put(message.getBytes());
                                        buffer.flip();
                                        client.write(buffer);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }

                                }
                            });
                            client.register(selector, SelectionKey.OP_READ);
                        }
                    } else if (key.isReadable()){
                        SocketChannel client = (SocketChannel)key.channel();

                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        int count = client.read(buffer);
                        if (count > 0){
                            String receiveMessage = new String(buffer.array(), 0, count);
                            System.out.println(receiveMessage);
                        }

                    }
                }
                keySet.clear();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
