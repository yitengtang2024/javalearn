package com.yiteng.interpractice;


public class TableTennisCoach extends Coach implements studyEnglish{
    public TableTennisCoach() {}
    public TableTennisCoach(String name,int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("Training player to study table tennis");

    }

    @Override
    public void studyEnglish() {
        System.out.println("Practice speaking English of table tennis");

    }
}
