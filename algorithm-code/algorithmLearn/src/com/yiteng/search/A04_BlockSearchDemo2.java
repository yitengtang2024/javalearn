package com.yiteng.search;

public class A04_BlockSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int target =50;
        int blockSize = 3;

        int result = blockSearch(arr, target, blockSize);
        System.out.println(result);

    }
    public static int blockSearch(int[] arr, int target, int blockSize) {
        int n = arr.length;

        //JUmp through blocks
        int i =0;
        while (i < n && arr[Math.min(i+blockSize-1,n-1)]< target) {
            i+=blockSize;

        }

        //Linear search within the block
        int end =Math.min(i+blockSize, n);
        for(int j = i; j< end; j++){
            if(arr[j] == target){
                return j;
            }
        }
        return -1;
    }
}
