package com.yiteng.arraylistdemon;
/*
* int -> Integer
* char -> Character
* boolean -> Boolean
* short -> Short
* long -> Long
 */

import java.util.ArrayList;

public class arraylistDemon2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
