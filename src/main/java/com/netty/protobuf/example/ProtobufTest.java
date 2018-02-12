package com.netty.protobuf.example;

import com.google.protobuf.InvalidProtocolBufferException;

public class ProtobufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        StudentData.Student.Builder builder = StudentData.Student.newBuilder().setName("zhangsan").setAge(20).setAddress("北京");
        StudentData.Student student = builder.build();

        byte[] byeArray = student.toByteArray();

        StudentData.Student obj = StudentData.Student.parseFrom(byeArray);

        System.out.println(obj);

        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
        System.out.println(obj.getAge());
    }
}
