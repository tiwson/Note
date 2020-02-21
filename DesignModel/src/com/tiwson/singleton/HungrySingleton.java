package com.tiwson.singleton;

/**
 * 饿汉单例模式
 * 一般单例模式使用这款就可以
 * 常用模式
 */
public class HungrySingleton {
    //静态单例
    private static HungrySingleton instance = new HungrySingleton();
    //私有构造函数
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            //新建100个线程创建instance实例，打印实例；
            new Thread(()->{
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }

}
