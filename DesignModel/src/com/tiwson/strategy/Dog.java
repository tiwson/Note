package com.tiwson.strategy;

public class Dog{
    private String height;
    private String weight;

    public Dog(String height, String weight) {
        this.height = height;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
