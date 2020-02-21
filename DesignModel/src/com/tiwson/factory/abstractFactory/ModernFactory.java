package com.tiwson.factory.abstractFactory;

public class ModernFactory implements Factory {

    @Override
    public Food createFood() {

        return new Susi();
    }

    @Override
    public Weapon createWeapon() {

        return new Ak47();
    }
}
