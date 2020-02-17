package com.tiwson.strategy;

public class Sorter<T> {
    //实现Comparable接口排序方法
//    public static void sort(Comparable[] arr) {
//        for(int i=0;i<arr.length;i++) {
//            int minPos = i;
//            for(int j=i+1;j<arr.length;j++) {
//                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j : minPos;
//            }
//            swap(arr,i,minPos);
//        }
//
//    }

    //实现Comparator接口排序方法
    public void sort(T[] arr , Comparator<T> comparator) {
        for(int i=0;i<arr.length;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                minPos = comparator.compare(arr[j],arr[minPos]) < 0 ? j : minPos;
            }
            swap(arr,i,minPos);
        }

    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
