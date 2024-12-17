package com.yiteng.search;

public class A02_BinarySearchDemon1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}



        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int index = binarySearch(arr, 150);
        System.out.println(index);


    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int hight = arr.length - 1;
        int mid = 0;
        while (low <= hight) {
            mid = (low + hight) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                hight = mid - 1;
            }else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }

}

