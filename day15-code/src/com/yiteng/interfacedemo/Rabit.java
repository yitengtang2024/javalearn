package com.yiteng.interfacedemo;

public class Rabit extends Animal{

    public Rabit(){}

    public Rabit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Rabit eat Carrot");
    }

    @Override
    public String toString() {
        return "Rabit{name = " + super.name + ", age = " + super.age + "}";
    }



}
