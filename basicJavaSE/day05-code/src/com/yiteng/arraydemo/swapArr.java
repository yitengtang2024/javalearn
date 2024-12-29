package com.yiteng.arraydemo;

public class swapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[4];
        arr[4] = arr[0];
        arr[0] = temp;
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
