package com.tiwson.decorator;

public class CheeseCake implements Cake {
    private String remark;
    public CheeseCake(String remark) {
        this.remark = remark;
    }

    @Override
    public String getImpression() {
        return remark;
    }
}
