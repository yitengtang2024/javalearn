package com.yiteng.methoddemo;

public class copyOfRange {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int[] copy;
       copy = copyOfRange(arr,2,arr.length-1);
       printArray(copy);
    }
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] result = new int[to - from + 1];
        for (int i = from; i <= to; i++) {
            result[i - from] = arr[i];
        }
        return result;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
