package com.tiwson.strategy;

public class Dog2Comparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
