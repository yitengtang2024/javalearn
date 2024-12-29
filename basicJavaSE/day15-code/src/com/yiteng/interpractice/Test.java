package com.yiteng.interpractice;

public class Test {
    public static void main(String[] args) {
        BasketBallPlayer bp = new BasketBallPlayer("James",23);
        bp.learnSports();
        BasketBallPlayer bc = new BasketBallPlayer("Jack",23);
        bc.learnSports();
        TableTennisCoach ttc = new TableTennisCoach("Liuguoliang",46);
        ttc.studyEnglish();
        ttc.teach();
        tableTennisPlayer ttp = new tableTennisPlayer("Datou",28);
        ttp.learnSports();
        ttp.studyEnglish();

    }
}
