package com.tiwson.bridge;

/**
 * 发送消息方式接口
 * 具体实现类有： MessageByEmail,MessageBySMS
 */
public interface MessageImpl {
    void send(String msg, String userTo);
}
