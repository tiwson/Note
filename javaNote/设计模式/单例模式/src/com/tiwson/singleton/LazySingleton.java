package com.tiwson.singleton;

/**
 * 懒汉单例模式
 */
public class LazySingleton {
    //定义LazySingleton私有实例参数；
    private static LazySingleton instance;
    //构建一个私有的构造函数；
    private LazySingleton() {

    }
    //返回单个实例对象；
    public static LazySingleton getInstance() {
        instance = new LazySingleton();
        //由于cpu运行太快，看不出效果，让线程休眠1毫秒。
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            //新建100个线程创建instance实例，打印实例；
            new Thread(()->{
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }


}
