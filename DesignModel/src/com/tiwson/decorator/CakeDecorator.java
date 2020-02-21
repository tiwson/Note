package com.tiwson.decorator;

public abstract class CakeDecorator implements Cake {
    Cake cake;
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
    abstract String getRemark();
}
