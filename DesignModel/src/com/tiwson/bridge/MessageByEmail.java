package com.tiwson.bridge;

public class MessageByEmail implements MessageImpl {
    @Override
    public void send(String msg, String userTo) {
        System.out.println("Email :--msg:" + msg + "; userTo:" + userTo);
    }
}
