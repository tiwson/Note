package com.tiwson.singleton;

/**
 * Enum枚举类型单例模式
 * 不仅可以解决线程同步，还可以方式反序列化
 * 注意是enum类型，不是class类型
 */
public enum EnumSingleton {
    instance;

    public void m() {

    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            //新建100个线程创建instance实例，打印实例；
            new Thread(()->{
                EnumSingleton instance = EnumSingleton.instance;
                System.out.println(instance.hashCode());
            }).start();
        }
    }

}
