package com.tiwson.singleton;

/**
 * 静态内部类方式的单例模式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * 该方法比饿汉模式还要好
 */
public class InnerClassSingleton {
    //私有构造函数
    private InnerClassSingleton(){}

    /**
     * 私有静态内部类
     * InnerClassSingleton加载时，不会加载该类
     */
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    //返回静态内部类创建的实例
    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            //新建100个线程创建instance实例，打印实例；
            new Thread(()->{
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }

}
