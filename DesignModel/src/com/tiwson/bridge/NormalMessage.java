package com.tiwson.bridge;

public class NormalMessage extends AbtractMessage {
    public NormalMessage(MessageImpl msgImpl) {
        super(msgImpl);
    }

    public void sendMessage(String msg, String userTo) {
        super.msgImpl.send(msg,userTo);
    }
}
