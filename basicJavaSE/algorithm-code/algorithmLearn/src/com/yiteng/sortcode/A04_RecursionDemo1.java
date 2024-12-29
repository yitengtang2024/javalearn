package com.yiteng.sortcode;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {
        //需求：利用递归求5的阶乘
        //5！ = 5 * 4 * 3 * 2 * 1;

        //核心：
        //1.找出口
        //2.找规律
        //心得：
        //方法内部再次调用方法的时候，参数必须要更加的靠近出口
        //第一次调用：5
        //第二次调用：4


        //5！ = 5 * 4!;
        //4！ = 4 * 3!;
        //3！ = 3 * 2!;
        //2！ = 2 * 1!;
        //1！ = 1;
        int result = mul(5);
        System.out.println(result);

    }
    public static int mul(int a) {
        if(a>1){
            return a*mul(a-1);
        }else{
            return 1;
        }

    }
}
