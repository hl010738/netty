package com.netty.identifyprotocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.nio.charset.Charset;
import java.util.UUID;

public class ServerHandler extends SimpleChannelInboundHandler<PersonProtocol> {

    private int count;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PersonProtocol msg) throws Exception {
        int contentLength = msg.getContentLength();
        byte[] content = msg.getContent();

        System.out.println("服务器端接收到的数据");
        System.out.println("长度: " + contentLength);
        System.out.println("内容: " + new String(content, Charset.forName("utf8")));

        System.out.println("服务器端收到的消息数量: " + ++count);

        String responseMessage = UUID.randomUUID().toString();
        byte[] messageByte = responseMessage.getBytes(Charset.forName("utf8"));

        PersonProtocol protocol = new PersonProtocol();
        protocol.setContentLength(messageByte.length);
        protocol.setContent(messageByte);

        ctx.writeAndFlush(protocol);

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
