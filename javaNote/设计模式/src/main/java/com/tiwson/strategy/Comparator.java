package com.tiwson.strategy;

/**
 * 实现该接口的子类，通过该接口比较两个对象的大小
 * @param <T>
 */
public interface Comparator<T> {
    int compare(T o1,T o2);
}
