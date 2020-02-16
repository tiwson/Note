package com.tiwson.factory.SimpleFactory;

public class CarFactory extends SimpleFactory {
    Creatable create() {
        return new Car();
    }
}
