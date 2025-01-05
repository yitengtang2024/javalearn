package com.yiteng.a04_treemap;

import java.util.TreeMap;

public class A04_TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan", 25);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 16);
        Student s4 = new Student("zhaoliu", 21);
        Student s5 = new Student("zhaoliu", 21);

        tm.put(s1,"shandong");
        tm.put(s2,"shanghai");
        tm.put(s3,"shanxi");
        tm.put(s4,"beijing");
        tm.put(s5,"shanghai");

        System.out.println(tm);
        tm.forEach((key,value)->System.out.println(key+":"+value));
    }
}
