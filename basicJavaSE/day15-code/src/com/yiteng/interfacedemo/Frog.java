package com.yiteng.interfacedemo;

public class Frog extends Animal implements Swim{

    public Frog() {}

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Frog eat insects");
    }

    @Override
    public void swim() {
        System.out.println("Frog swim");
    }

    @Override
    public String toString() {
        return "Frog{name = "+name+"age = "+ age+ "}";
    }
}
