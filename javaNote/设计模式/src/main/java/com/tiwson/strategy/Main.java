package com.tiwson.strategy;
import java.util.Arrays;


/**
 * 开闭原则：对更改关闭，对扩展开放。使程序弹性更好，原始代码尽量闭合不去更改，新代码可以灵活加入。
 */
public class Main {
    public static void main(String[] args) {
        Dog[] dog ={new Dog("5","7"),new Dog("8","9"),new Dog("8","3"),new Dog("c","8"),new Dog("a","f")};
        //Sorter<Dog> ds = new Sorter<Dog>();
        //ds.sort(dog,new DogComparator());
        Sorter<Dog> ds = new Sorter<Dog>();
        //通过传入不同的strategy比较器，实现不同的比较方法排序；
        ds.sort(dog,new Dog2Comparator());
        System.out.println(Arrays.toString(dog));
    }
}
