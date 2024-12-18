package com.yiteng.sortcode;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
              /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */

        int[] arr = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);//left side of the partition; repeat to use quickSort untile low < high (only 1 element is left)
            quickSort(arr, pi+1, high);//right side of the partition
        }

    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low -1;//double pointer, i record the position of the element less than the pivot

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;//increment or move the pointer
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, high);
        return i+1;//return the index of the pivot
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr) {
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
