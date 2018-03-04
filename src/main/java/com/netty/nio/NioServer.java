package com.netty.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * NIO 网络编程
 * 多个客户端同时绑定到一个端口
 */
public class NioServer {

    private static Map<String, SocketChannel> clientMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(Boolean.FALSE);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8899);
        serverSocketChannel.bind(inetSocketAddress);

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (Boolean.TRUE){
            selector.select();
            Set<SelectionKey> selectionKeySet = selector.selectedKeys();
            selectionKeySet.forEach(x -> {
                try {
                    if(x.isAcceptable()){
                        ServerSocketChannel server = (ServerSocketChannel) x.channel();
                        SocketChannel client = server.accept();
                        client.configureBlocking(Boolean.FALSE);
                        client.register(selector, SelectionKey.OP_READ);

                        String key = UUID.randomUUID().toString();
                        clientMap.put(key, client);
                    } else if (x.isReadable()){
                        SocketChannel client = (SocketChannel) x.channel();
                        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                        int count = client.read(readBuffer);

                        if (count > 0){
                            readBuffer.flip();
                            Charset charset = Charset.forName("utf-8");
                            String receiveMessage = String.valueOf(charset.decode(readBuffer).array());

                            System.out.println(client + ": " + receiveMessage);

                            String senderKey = null;

                            for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()){
                                if (client == entry.getValue()){
                                    senderKey = entry.getKey();
                                    break;
                                }
                            }

                            for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()){
                                SocketChannel value = entry.getValue();

                                ByteBuffer buffer = ByteBuffer.allocate(1024);
                                buffer.put((senderKey + " : " + receiveMessage).getBytes());

                                buffer.flip();
                                value.write(buffer);
                            }
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            selectionKeySet.clear();
        }
    }
}
