package com.yiteng.a05_myset;

import java.util.HashSet;
import java.util.Iterator;

public class A01_SetDemo2 {
    public static void main(String[] args) {
         /*
           利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式

        */
        HashSet<String> set = new HashSet<>();

        set.add("abc");
        set.add("def");
        set.add("ghi");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashSet<Integer> setInteger = new HashSet<>();
        setInteger.add(11);
        setInteger.add(15);
        setInteger.add(6);
        setInteger.add(8);
        setInteger.add(12);
        for (Integer i: setInteger) {
            System.out.println(i);
        }
        setInteger.forEach(System.out::println);
        setInteger.forEach(i -> System.out.println(i));

        System.out.println("------------------");
        for (Integer jk : setInteger) {
            System.out.println(jk.hashCode());
        }
        System.out.println("----------------");
        for (String s : set) {
            System.out.println(s.hashCode());

        }
    }
}
