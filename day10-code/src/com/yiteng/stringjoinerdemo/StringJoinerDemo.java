package com.yiteng.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        StringJoiner joiner = new StringJoiner(", ", "[","]");// stringjoiner, first the comma between string, starting with [ and end with ]
        for (int i = 0; i < arr.length; i++) {
            joiner.add(arr[i] + "");

        }
        System.out.println(joiner.toString());

        int length = joiner.length();
        System.out.println(length);


    }

}
