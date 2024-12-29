package com.yiteng.search;

public class A01_BasicSearchDemon1 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心：
        //从0索引开始挨个往后查找

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int target = 1;

        boolean flag = isExist(arr, target);
        System.out.println(flag);



    }



    //参数：
    //一：数组
    //二：要查找的元素

    //返回值：
    //元素是否存在
    private static boolean isExist(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) {
                return true;
            }

        }
        return false;
    }


}

