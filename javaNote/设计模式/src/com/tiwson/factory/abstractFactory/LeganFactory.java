package com.tiwson.factory.abstractFactory;

public class LeganFactory implements Factory {

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
