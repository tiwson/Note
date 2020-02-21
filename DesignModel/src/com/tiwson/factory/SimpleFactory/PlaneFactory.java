package com.tiwson.factory.SimpleFactory;

public class PlaneFactory extends SimpleFactory{
    Creatable create() {
        return new Plane();
    }
}
