package com.yiteng.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Person dogfeeder = new AnimalFeeder();
        Person catfeeder = new AnimalFeeder();

        dog.setAge(2);
        dog.setColor("black");
        dog.eat("骨头");

        cat.setAge(3);
        cat.setColor("grey");
        cat.eat("鱼");

        dogfeeder.setAge(30);
        dogfeeder.setName("Wang");
        ((AnimalFeeder) dogfeeder).keepPet(dog,"骨头");

        catfeeder.setName("Lee");
        catfeeder.setAge(25);
        ((AnimalFeeder) catfeeder).keepPet(cat,"鱼");




    }
}
