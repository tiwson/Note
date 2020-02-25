package com.tiwson.bridge;

public class MergenMessage extends AbtractMessage {
    public MergenMessage(MessageImpl msgImpl) {
        super(msgImpl);
    }

    @Override
    public void sendMessage(String msg, String userTo) {
        msg += "Imergency Message";
        super.msgImpl.send(msg,userTo);
    }


}
