package com.tiwson.bridge;

/**
 * 桥接模式
 * 通过绑定接口实现类
 * 抽象归抽象：AbtractMessage及其子类
 * 实现类归实现类：MessageImpl及其子类
 */
public class BridgeMain {
    public static void main(String[] args) {
        //通过聚合发送消息接口形式，动态绑定发送消息的方式
        AbtractMessage msg = new NormalMessage(new MessageByEmail());
        msg.sendMessage("Normal Message By Email !","admin");

        msg = new MergenMessage(new MessageBySMS());
        msg.sendMessage("Mergen Message By Email !","eason");
    }
}
