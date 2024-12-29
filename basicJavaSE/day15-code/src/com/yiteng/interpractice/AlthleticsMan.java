package com.yiteng.interpractice;

public abstract class AlthleticsMan extends Sportsman {

    public AlthleticsMan() {}

    public AlthleticsMan(String name, int age) {
        super(name, age);
    }

    public abstract void learnSports();

}
