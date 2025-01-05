package com.yiteng.a03_linkedhashmap;

import java.util.LinkedHashMap;

public class A03_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("a", 1);
        lhm.put("b", 2);
        lhm.put("c", 3);
        lhm.put("d", 4);
        lhm.put("e", 5);
        lhm.put("e", 6);

        System.out.println(lhm);
    }
}
