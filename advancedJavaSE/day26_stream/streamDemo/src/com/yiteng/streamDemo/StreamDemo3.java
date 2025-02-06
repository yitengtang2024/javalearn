package com.yiteng.streamDemo;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        map.keySet().stream().forEach(s -> System.out.println(s));

        map.entrySet().stream().forEach(e -> System.out.println(e));
    }
}
