package com.yiteng.arrayutil;

import static com.yiteng.arrayutil.ArrayUtil.getAverage;
import static com.yiteng.arrayutil.ArrayUtil.printArr;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArr(arr);
        double[] arr1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        double average = getAverage(arr1);
        System.out.println(average);
    }
}
