package com.yiteng.demo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("James",18,"M");
        Student s2 = new Student("Bob",19,"M");
        Student s3 = new Student("John",20,"M");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        int elderAge = StudentUtil.getElder(students);
        System.out.println(elderAge);
    }
}
