package com.netty.zerocopy;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OldServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8899);

        while (Boolean.TRUE){
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            byte[] buffer = new byte[4096];

            while (Boolean.TRUE){
                int readCount = dataInputStream.read(buffer, 0, buffer.length);
                if(-1 == readCount){
                    break;
                }
            }
        }
    }
}
