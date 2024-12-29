package com.yiteng.methoddemo;

public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}
