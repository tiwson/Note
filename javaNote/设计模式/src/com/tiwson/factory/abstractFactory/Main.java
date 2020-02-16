package com.tiwson.factory.abstractFactory;

/**
 * 工厂模式：能 new 对象的class或者method，都可以称为工厂模式
 * 单例模式也是工厂模式
 * Interface Factory  --> ModernFactory , LeganFactory;
 * AbstractClass Food , Weapon --> Susi,Mushroom , Ak47,MagicStick;
 * Factory can create Food and Weapon
 * Food , Weapon can create there subClass
 */
public class Main {
    Factory factory = new ModernFactory();
    Food f = factory.createFood();
    Weapon w = factory.createWeapon();
}
