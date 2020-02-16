package com.tiwson.factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
//        Creatable c = new Car();
//        c.create();
//        c = new Plane();
//        c.create();
        SimpleFactory factory = new CarFactory();
        Creatable c = factory.create();
        c.create();
    }
}
