package com.yiteng.lambda;

import java.util.Arrays;

public class lambdaDemo {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa","aa","aaa","aaaaaaa"};

        Arrays.sort(arr, (o1, o2) -> {
            int o1length = o1.length();
            int o2length = o2.length();
            return o1length - o2length;
        });

        System.out.println(Arrays.toString(arr));
    }
}
