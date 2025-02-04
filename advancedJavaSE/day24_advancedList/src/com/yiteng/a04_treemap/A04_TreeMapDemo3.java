package com.yiteng.a04_treemap;

import java.util.TreeMap;

public class A04_TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c)+1);
            }
            else {
                tm.put(c, 1);
            }
        }
        System.out.println(tm);
    }
}
