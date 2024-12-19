package com.yiteng.practice1;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {

        Student s1 = new Student("Alice",21,183);
        Student s2 = new Student("Bob",21,183);
        Student s3 = new Student("John",19,185);
        Student s4 = new Student("Jane",20,171);
        Student s5 = new Student("Jack",24,172);

        Student[] students = {s1,s2,s3,s4,s5};

/*
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        Arrays.stream(students).forEach(System.out::println);
*/
        Arrays.sort(students,((o1, o2) -> {
            if(o1.getAge()!=o2.getAge()){
                return o1.getAge()-o2.getAge();
            }
            if(o1.getHeight()!=o2.getHeight()){
                return o1.getHeight()-o2.getHeight();
            }
            if(o1.getName()!=o2.getName()){
                return o1.getName().compareTo(o2.getName());
            }
            return 0;
        }));
        Arrays.stream(students).forEach(System.out::println);

    }
}
