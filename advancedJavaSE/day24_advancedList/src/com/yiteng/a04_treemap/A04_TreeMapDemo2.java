package com.yiteng.a04_treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A04_TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1 - o2;
            }
        });
        TreeMap<Integer, String> tm2 = new TreeMap<>((o1, o2)-> o1 - o2);
    }
}
