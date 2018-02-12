package com.netty.grpc;

import com.netty.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.Iterator;



public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899)
                .usePlaintext(true).build();
        PersonServiceGrpc.PersonServiceBlockingStub blockingStub = PersonServiceGrpc
                .newBlockingStub(managedChannel);

        PersonServiceGrpc.PersonServiceStub stub = PersonServiceGrpc.newStub(managedChannel);


        MyResponse response = blockingStub.getRealNameByUserName(MyRequest.newBuilder().setUsername("lisi").build());

        System.out.println(response.getRealName());

        System.out.println("---------------------");

        Iterator<PersonResponse> list = blockingStub.getPersonByAge(PersonRequest.newBuilder().setAge(20).build());

        while (list.hasNext()){
            PersonResponse item = list.next();
            System.out.println(item.getName());
            System.out.println(item.getAge());
            System.out.println(item.getAddress());
        }

        System.out.println("---------------------------");



        StreamObserver<PersonResponseList> responseListStreamObserver = new StreamObserver<PersonResponseList>() {
            @Override
            public void onNext(PersonResponseList value) {
                value.getPersonResponseListList().forEach(x -> {
                    System.out.println(x.getName());
                    System.out.println(x.getAge());
                    System.out.println(x.getAddress());
                    System.out.println("**********");
                });
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        };


        /**

        //由于是异步的Stub，所以程序调用完之后还没来得及发送数据就往下执行到onCompleted结束，所以不会有任何输出.
        StreamObserver<PersonRequest> requestStreamObserver = stub.getPersonWrapperByAges(responseListStreamObserver);

        requestStreamObserver.onNext(PersonRequest.newBuilder().setAge(10).build());
        requestStreamObserver.onNext(PersonRequest.newBuilder().setAge(20).build());
        requestStreamObserver.onNext(PersonRequest.newBuilder().setAge(30).build());

        requestStreamObserver.onCompleted();
         *
         */

        /**
         * 这里的代码会产生疑惑, 为什么传入的response，返回值是request
         *
         * 这里的代码可以这样理解，stub.biTalk 并没有调用服务器端的代码，这里只是在客户端定义了服务器端回调的动作
         * 因此，传入的response 是定义了服务器端返回response 的动作, 传入的response等于就是告诉服务器端
         * 返回的时候怎么做.
         *
         * 可以这么理解
         *
         * 从服务器端往客户端传输的数据都叫response
         * 从客户端向服务器端传输数据都叫request
         */
        StreamObserver<StreamRequest> requestStreamObserver = stub.biTalk(new StreamObserver<StreamResponse>() {

            //Client这里是new出来一个response
            @Override
            public void onNext(StreamResponse value) {
                System.out.println(value.getResponseInfo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });

        for (int i = 0; i < 10; i++){

            //这里的代码才是真正调用远端服务器的代码，传输数据
            //这里的代码调用了Server端，也就是ServiceImpl的onNext方法
            requestStreamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(LocalDateTime.now().toString()).build());

            Thread.sleep(1000);
        }


        //添加这行代码，是线程休眠，这样使stub有时间发送数据
        Thread.sleep(5000);
    }
}
