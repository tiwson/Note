package com.tiwson.bridge;

public class MessageBySMS implements MessageImpl {
    @Override
    public void send(String msg, String userTo) {
        System.out.println("SMS: ---- msg:" + msg + "; userTo:" + userTo);
    }
}
