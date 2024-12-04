package com.yiteng.interpractice;

public class tableTennisPlayer extends AlthleticsMan implements studyEnglish{

    public tableTennisPlayer() {}

    public tableTennisPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void learnSports() {
        System.out.println("Study table tennis skills");
    }

    @Override
    public void studyEnglish() {
        System.out.println("Learn how to speak English about table tennis");
    }
}
