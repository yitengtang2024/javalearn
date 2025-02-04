package com.yiteng.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> porker = new HashMap<>();
    static ArrayList<Integer> indexes = new ArrayList<>();

    static {
        /*
         * prepare the poker that used to play
         * this include "3","4","5","6","7","8","9","10","J","Q","K","A","2"
         * different color "♦", "♥", "♣", "♠"♦ (diamond), ♥ (red heart), ♥ (black heart), and ♣ club/leaf
         */
        int index_number = 1;
        String[] colors = {"♦", "♥", "♣", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String number : numbers) {
            for (String color : colors) {
                porker.put(index_number, number + color);
                indexes.add(index_number);
                index_number++;
            }

        }
        porker.put(index_number, "BJoker");
        indexes.add(index_number);
        index_number++;
        porker.put(index_number, "LJoker");
        indexes.add(index_number);

    }

    public PokerGame() {
        /*
         *shuffle the porker and give it to the player
         * 3 of the top card are the dipai(lord) card for play who will be a load
         */
        TreeSet<Integer> load = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        Collections.shuffle(indexes);
        for (int i = 0; i < indexes.size(); i++) {
            int card = indexes.get(i);
            if (i <= 2) {
                load.add(card);
            } else if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else {
                player3.add(card);
            }

        }
        System.out.println(porker);
        show_card("dipai",load);
        show_card("dawang",player1);
        show_card("xiaowang",player2);
        show_card("zhongwang",player3);

    }

    public void show_card(String name, TreeSet<Integer> player) {
        System.out.println(name+": ");
        for (Integer i : player) {
            System.out.print(porker.get(i)+" ");

        }
        System.out.println();
    }
}
