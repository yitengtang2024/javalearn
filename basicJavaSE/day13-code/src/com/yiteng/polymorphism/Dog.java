package com.yiteng.polymorphism;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        System.out.println(super.getAge() + "岁的"+super.getColor()+"颜色的狗两只前腿死死的抱住 " + food + "猛吃");
    }

    public void lookHome() {
        System.out.println("Dog lookHome");
    }
}
