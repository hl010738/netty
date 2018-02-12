package com.netty.socket.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.UUID;

public class ServerHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        String remoteAddress = ctx.channel().remoteAddress().toString();
        System.out.println("Server: " + remoteAddress + " : " + msg);
        ctx.channel().writeAndFlush("Server: " + UUID.randomUUID());
        Thread.sleep(2000);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.channel().close();
    }
}
