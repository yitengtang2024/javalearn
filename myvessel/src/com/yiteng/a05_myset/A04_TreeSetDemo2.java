package com.yiteng.a05_myset;

import java.util.TreeSet;

public class A04_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
         *
         *       需求：利用TreeSet存储整数并进行排序
         *
         * */

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(4);
        ts.add(3);
        ts.add(5);
        ts.add(1);
        ts.forEach(System.out::println);
        System.out.println(ts);
    }
}
