package com.tiwson.strategy;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getHeight().compareTo(o2.getHeight());
    }
}
