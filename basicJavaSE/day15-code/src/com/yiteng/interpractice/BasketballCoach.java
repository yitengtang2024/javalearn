package com.yiteng.interpractice;

public class BasketballCoach extends Coach {


    public BasketballCoach() {}
    public BasketballCoach(String name, int age ) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("Training player to play baskteball");

    }

}
