package com.yiteng.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PorkGame {
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<>();

    static{
        /*
         * prepare the poker that used to play
         * this include "3","4","5","6","7","8","9","10","J","Q","K","A","2"
         * different color "♦", "♥", "♣", "♠"♦ (diamond), ♥ (red heart), ♥ (black heart), and ♣ club/leaf
         */
        String[] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors ={"♦", "♥", "♣", "♠"};

        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",14);
        map.put("2",15);
        map.put("LJoker",16);
        map.put("BJoker",17);
        for (String color : colors) {
            for (String number : numbers) {
                list.add(color + number);
            }
        }
        list.add(" LJoker");
        list.add(" BJoker");
    }

    public PorkGame() {
        ArrayList<String> load = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String card = list.get(i);
            if (i<=2){
               load.add(card);
               continue;
            }
            if(i%3==0){
                player1.add(card);
            }
            else if(i%3 ==1){
                player2.add(card);
            }
            else{
                player3.add(card);
            }
        }
        sort_card(load);
        sort_card(player1);
        sort_card(player2);
        sort_card(player3);
        System.out.println(player1);

    }
    public void sort_card(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int value1 = get_value(o1);
                int value2 = get_value(o2);
                return value1-value2;
            }
        });
    }
    public int get_value(String card){
        String value = card.substring(1);
        if(map.containsKey(value)){
            return map.get(value);
        }
        else{
            return Integer.parseInt(value);
        }
    }
}
