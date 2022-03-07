package com.cauchy.behavior.strategy;

/**
 * @author Cauchy
 * @ClassName SorterByComparableInterface.java
 * @Date 2019年11月30日
 * @Description 通过Comparable接口比较两个对象大小
 * @Version
 */
public class SorterByComparableInterface {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    static void swap(Comparable arr[], int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
