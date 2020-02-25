package com.tiwson.bridge;

/**
 * 消息类型抽象类
 * 子类有：NormalMessage,MergenMessage
 * 通过聚合发送消息方式接口形式，实现桥接模式
 */
public abstract class AbtractMessage {
    //发送消息方式的接口
    MessageImpl msgImpl;

    public AbtractMessage(MessageImpl msgImpl) {
        this.msgImpl = msgImpl;
    }

    public abstract void sendMessage(String msg , String userTo);

}
