package com.yiteng.sortcode;

public class A04_RecursionDemo {
    public static void main(String[] args) {
        //需求：利用递归求1-100之间的和
        //100 + 99 + 98 + 97 + 96 + 95 .... + 2 + 1

        //大问题拆解成小问题
        //1~100之间的和 = 100 + （1~99之间的和）
        //1~99之间的和 = 99 + （1~98之间的和）
        //1~98之间的和 = 98 + （1~97之间的和）
        //。。。
        //1~2之间的和 = 2 + （1~1之间的和）
        //1~1之间的和 = 1（递归的出口）

        //核心：
        //1.找出口
        //2.找规律
        int result = sum(100);
        System.out.println(result);

    }
    public static int sum(int number){
        if(number > 0 ){
            return number + sum(number -1);
        }else{
            return 0;
        }
    }
}
