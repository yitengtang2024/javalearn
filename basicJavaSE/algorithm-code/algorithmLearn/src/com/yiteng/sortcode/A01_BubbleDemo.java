package com.yiteng.sortcode;

public class A01_BubbleDemo {
    /*
    冒泡排序：
    核心思想：
    1，相邻的元素两两比较，大的放右边，小的放左边。
    2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
    3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
*/
    public static void main(String[] args) {

        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        int round = arr.length;

        while (round > 0) {
            for(int i = 0; i< round-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            round--;
        }
        for(int num: arr){
            System.out.println(num);
        }
    }

}
