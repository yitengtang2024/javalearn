package com.yiteng.arraylistdemon;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Please input the new student name:");
        s1.setName(scanner.next());
        System.out.println("Please input the new student age:");
        s1.setAge(scanner.nextInt());
        students.add(s1);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }
    }
}
