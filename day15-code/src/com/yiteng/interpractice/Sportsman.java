package com.yiteng.interpractice;

public class Sportsman {
    String name;
    int age;

    public Sportsman() {
    }

    public Sportsman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
