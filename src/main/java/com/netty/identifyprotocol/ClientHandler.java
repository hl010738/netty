package com.netty.identifyprotocol;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.nio.charset.Charset;

public class ClientHandler extends SimpleChannelInboundHandler<PersonProtocol> {

    private int count;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PersonProtocol msg) throws Exception {

        System.out.println("客户端接收到的消息: ");
        System.out.println("长度: " + msg.getContentLength());
        System.out.println("内容: " + new String(msg.getContent(), Charset.forName("utf8")));
        System.out.println("客户端接收到消息的数量: " + ++count);

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 10; i++){
            String messageToBeSent = new String("Sent from client " + i + 1);
            int length = messageToBeSent.getBytes(Charset.forName("utf8")).length;
            byte[] content = messageToBeSent.getBytes(Charset.forName("utf8"));

            PersonProtocol protocol = new PersonProtocol();
            protocol.setContent(content);
            protocol.setContentLength(length);

            ctx.writeAndFlush(protocol);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
