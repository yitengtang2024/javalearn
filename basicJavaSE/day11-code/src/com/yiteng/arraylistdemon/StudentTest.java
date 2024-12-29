package com.yiteng.arraylistdemon;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Janmes",18);
        Student s2 = new Student("Harden",19);
        students.add(s1);
        students.add(s2);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }

    }
}
