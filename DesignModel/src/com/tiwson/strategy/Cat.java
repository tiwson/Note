package com.tiwson.strategy;

public class Cat implements Comparable<Cat> {

    private String weight;

    public Cat(String weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        int i = this.weight.compareTo(o.weight);
        System.out.println(i);
        return i;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight='" + weight + '\'' +
                '}';
    }
}
