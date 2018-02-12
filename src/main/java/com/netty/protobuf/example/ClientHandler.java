package com.netty.protobuf.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class ClientHandler extends SimpleChannelInboundHandler<StudentData.DataInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, StudentData.DataInfo msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        int random = new Random().nextInt(3);

        StudentData.DataInfo.Builder builder = StudentData.DataInfo.newBuilder();

        if(random == 0){
            StudentData.Student student = StudentData.Student.newBuilder()
                    .setName("张三").setAge(20).setAddress("beijing").build();
            builder.setDataType(StudentData.DataInfo.DataType.StudentType)
                    .setStudent(student).build();
        } else if (random == 1){
            StudentData.Teacher teacher = StudentData.Teacher.newBuilder()
                    .setTeacherName("Teacher name").setClazz("高三3班").build();
            builder.setDataType(StudentData.DataInfo.DataType.TeacherType)
                    .setTeacher(teacher).build();
        } else {
            StudentData.School school = StudentData.School.newBuilder()
                    .setSchoolName("清华附中").setCity("beijing").build();
            builder.setDataType(StudentData.DataInfo.DataType.SchoolType)
                    .setSchool(school).build();
        }

        ctx.channel().writeAndFlush(builder.build());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
