package com.yiteng.polymorphism;

public class Cat extends Animal {
    @Override
    public void eat(String food) {
        System.out.println(super.getAge() + "岁的"+super.getColor()+"颜色的猫眯着眼睛侧着头吃 " + food);
    }
    public void catchMouse(){
        System.out.println("Cat catch mouse");
    }
}
