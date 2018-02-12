package com.netty.protobuf.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class ServerHandler extends SimpleChannelInboundHandler<StudentData.DataInfo>{

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, StudentData.DataInfo msg) throws Exception {

        StudentData.DataInfo.DataType random = msg.getDataType();

        if(random == StudentData.DataInfo.DataType.StudentType){
            StudentData.Student student = msg.getStudent();

            System.out.println("student name: " + student.getName());
            System.out.println("student age: "+ student.getAge());
            System.out.println("student address: " + student.getAddress());
        } else if (random == StudentData.DataInfo.DataType.TeacherType){
            StudentData.Teacher teacher = msg.getTeacher();
            System.out.println("teacher name: " + teacher.getTeacherName());
            System.out.println("teacher class: "+ teacher.getClazz());

        } else {
            StudentData.School school = msg.getSchool();
            System.out.println("school name: " + school.getSchoolName());
            System.out.println("school city: "+ school.getCity());
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
