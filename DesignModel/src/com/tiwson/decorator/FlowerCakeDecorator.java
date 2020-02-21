package com.tiwson.decorator;

public class FlowerCakeDecorator extends CakeDecorator {

    public FlowerCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    String getRemark() {
        return "花朵蛋糕";
    }

    @Override
    public String getImpression() {
        return cake.getImpression() + getRemark();
    }
}
