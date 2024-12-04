package com.yiteng.interpractice;

public abstract class Coach extends Sportsman{
    public Coach() {}
    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
