package com.yiteng.methoddemo;

public class ExistNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean exist =  ExistNumber(arr,6);
        System.out.println(exist);
    }
    public static boolean ExistNumber(int[] arr, int target) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
            }
        }
        return flag;

    }
}
