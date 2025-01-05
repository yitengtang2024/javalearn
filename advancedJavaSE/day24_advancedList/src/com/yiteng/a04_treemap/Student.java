package com.yiteng.a04_treemap;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(@NotNull Student o) {
        if(this.age != o.age){
            return this.age - o.age;
        }
        if(this.name != o.name){
            return this.name.compareTo(o.name);
        }
        return 0;
    }

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
