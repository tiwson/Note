package com.tiwson.decorator;

public class NutCakeDecorator extends CakeDecorator {

    public NutCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    String getRemark() {
        return "坚果蛋糕";
    }

    @Override
    public String getImpression() {
        return cake.getImpression() + getRemark();
    }
}
