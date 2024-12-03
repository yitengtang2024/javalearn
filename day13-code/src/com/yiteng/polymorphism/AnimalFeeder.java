package com.yiteng.polymorphism;

public class AnimalFeeder extends Person {
    public void keepPet(Animal animal, String food){
        if(animal instanceof Dog){
            System.out.println("年龄为"+super.getAge()+"老王养了一只黑颜色的"+animal.getAge()+"岁的狗");
        }else if(animal instanceof Cat){
            System.out.println("年龄为"+super.getAge()+"老王养了一只黑颜色的"+animal.getAge()+"岁的猫");
        }else{
            System.out.println("there no sucha animal class");
        }

    }
}
