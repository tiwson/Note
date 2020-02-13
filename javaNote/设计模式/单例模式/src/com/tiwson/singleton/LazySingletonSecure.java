package com.tiwson.singleton;

/**
 * 懒汉单例模式
 */
public class LazySingletonSecure {
    //定义LazySingleton私有实例参数；
    private static LazySingletonSecure instance;
    //构建一个私有的构造函数；
    private LazySingletonSecure() {

    }
    //返回单个实例对象；
    public static LazySingletonSecure getInstance() {
        //多重检查；
        //第一个if语句是为了减少synchronize上锁的次数；
        //第二个if语句是为了防止上锁前创造了实例；
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingletonSecure();
                }
            }

        }

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
                LazySingletonSecure instance = LazySingletonSecure.getInstance();
                System.out.println(instance);
            }).start();
        }
    }


}
