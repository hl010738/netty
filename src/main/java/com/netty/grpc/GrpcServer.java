package com.netty.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GrpcServer {

    private Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer server = new GrpcServer();
        server.start();
        server.awaitTermination();
    }

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8899).addService(new PersonServiceImpl()).build();

        this.server.start();

        System.out.println("Server up!");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("关闭JVM");
            GrpcServer.this.stop();
        }));

        System.out.println("-----------------");

    }

    private void awaitTermination() throws InterruptedException {
        if(null != server){
            this.server.awaitTermination();
        }
    }

    private void stop(){
        if(null != server){
            server.shutdown();
        }
    }
}
