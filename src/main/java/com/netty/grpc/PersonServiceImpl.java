package com.netty.grpc;

import com.netty.proto.*;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class PersonServiceImpl extends PersonServiceGrpc.PersonServiceImplBase {

    //这里是在服务器端定义了客户端传输数据过来后，服务器端应该怎么做
    @Override
    public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamResponse> responseObserver) {

        //在服务器端是new出来一个request
        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println(value.getRequestInfo());

                //这里的代码是调用了Client端的onNext
                responseObserver.onNext(StreamResponse.newBuilder().setResponseInfo(UUID.randomUUID().toString()).build());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<PersonRequest> getPersonWrapperByAges(StreamObserver<PersonResponseList> responseObserver) {
        return new StreamObserver<PersonRequest>() {
            @Override
            public void onNext(PersonRequest value) {
                System.out.println("on next: " + value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                PersonResponse r1 = PersonResponse.newBuilder().setName("aaa").setAge(60).setAddress("成都").build();
                PersonResponse r2 = PersonResponse.newBuilder().setName("bbb").setAge(70).setAddress("深圳").build();

                PersonResponseList list = PersonResponseList.newBuilder().addPersonResponseList(r1).addPersonResponseList(r2).build();

                responseObserver.onNext(list);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getPersonByAge(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
        System.out.println("接受参数: " + request.getAge());

        responseObserver.onNext(PersonResponse.newBuilder().setName("张三").setAge(10).setAddress("广州").build());
        responseObserver.onNext(PersonResponse.newBuilder().setName("lisi").setAge(20).setAddress("beijing").build());
        responseObserver.onNext(PersonResponse.newBuilder().setName("wangwu").setAge(30).setAddress("杭州").build());
        responseObserver.onNext(PersonResponse.newBuilder().setName("赵柳").setAge(10).setAddress("shanghai").build());

        responseObserver.onCompleted();
    }

    @Override
    public void getRealNameByUserName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接受参数: " + request.getUsername());

        responseObserver.onNext(MyResponse.newBuilder().setRealName("张三").build());
        responseObserver.onCompleted();
    }
}
