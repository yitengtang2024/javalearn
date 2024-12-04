package com.yiteng.interfacedemo;

public class Test {

    public static void main(String[] args) {
        Animal rabit = new Rabit("lala", 4);
        System.out.println(rabit);
        rabit.eat();

        Dog dog = new Dog("James", 5);
        dog.eat();
        dog.swim();
        System.out.println(dog);


        Frog frog = new Frog("JJ", 2);
        System.out.println(frog);
        frog.eat();
        frog.swim();

    }
}
