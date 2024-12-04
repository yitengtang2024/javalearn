package com.yiteng.interfacedemo;

public class Dog extends Animal implements Swim {

    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("Dog eat bones");
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }

    @Override
    public String toString(){
        return "Dog{name = "+ name+ ", age= "+ age+ "}";
    }
}
