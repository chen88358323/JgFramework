package com.zhaidaosi.game.jgframework.message;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

public class MessageEncode extends MessageToMessageEncoder<Object> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, List<Object> out) {
        if(msg == null) {
            return ;
        }
        if (msg instanceof IBaseMessage) {
            msg = msg.toString() + "\r\n";
        }
        out.add(msg);
    }

}
