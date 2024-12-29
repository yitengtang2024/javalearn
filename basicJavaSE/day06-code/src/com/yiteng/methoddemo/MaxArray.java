package com.yiteng.methoddemo;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int max = maxArray(arr);
        System.out.println(max);
    }
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}
