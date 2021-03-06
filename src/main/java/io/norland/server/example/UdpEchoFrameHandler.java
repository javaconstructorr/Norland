package io.norland.server.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.norland.proto.AbstractWrapper;

public class UdpEchoFrameHandler
        extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        ctx.channel().writeAndFlush(msg);
//        ctx.fireChannelRead(msg);
    }
}