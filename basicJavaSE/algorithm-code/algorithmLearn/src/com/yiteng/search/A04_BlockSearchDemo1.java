package com.yiteng.search;

public class A04_BlockSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int target = 50;
        int result = jumpSearch(arr, target);
        System.out.println(result);
    }
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);

        //Finding the block
        //the arr do not need to cut to different blocks, the condition of the while
        //loop will skip the data by comparing the starting arr[i] with the target
        //skip to the next if the arr[i] < target
        //block search is efficienct with sorted arr
        int prev = 0;
        while (prev < n && arr[Math.min(prev, n-1)] <= target) {
            if(arr[Math.min(prev, n-1)] == target) {
                return Math.min(prev, n-1);
            }
            prev+=blockSize;

        }
        prev -=blockSize;
        while(prev<Math.min(prev+blockSize, n)) {
            if(arr[prev] == target) {
                return prev;
            }
            prev++;
        }
        return -1;
    }
}
