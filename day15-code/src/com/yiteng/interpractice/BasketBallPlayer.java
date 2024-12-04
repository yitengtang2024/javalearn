package com.yiteng.interpractice;

public class BasketBallPlayer extends AlthleticsMan {

    public BasketBallPlayer() {}
    public BasketBallPlayer(String name, int age){
        super(name, age);
    }

    @Override
    public void learnSports() {
        System.out.println("Study basketball skills");

    }

}
