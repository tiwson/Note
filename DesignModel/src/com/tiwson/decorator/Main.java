package com.tiwson.decorator;

/**
 * 装饰器Decorator模式
 * 例子：
 * 芝士蛋糕CheeseCake继承了蛋糕Cake（严格来讲蛋糕Cake类应该用abstract）
 * 蛋糕装饰器CakeDecorator也继承了蛋糕Cake
 * 蛋糕装饰器下可有很多不同的装饰器（例如坚果装饰器NutCakeDecorator、花朵装饰器FlowerDecorator）
 * 坚果装饰器NutCakeDecorator和花朵装饰器FlowerDecorator都可以装饰芝士蛋糕CheeseCake
 */
public class Main {
    public static void main(String[] args) {
        Cake cake = new NutCakeDecorator(new FlowerCakeDecorator(new CheeseCake("芝士蛋糕")));
        System.out.println(cake.getImpression());
    }
}
