package com.yiteng.sortcode;

public class A03_InsertDemo1 {
    public static void main(String[] args) {
                        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
        int[] arr = {3, 10, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        insertionSort(arr);
        printArray(arr);

    }
    public static void insertionSort(int[] arr) {
        for(int i =1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

            System.out.println("Round "+ i +": ");
            printArray(arr);
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
