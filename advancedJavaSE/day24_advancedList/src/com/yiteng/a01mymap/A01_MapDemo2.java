package com.yiteng.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        boolean e = map.containsKey(1);
        System.out.println(e);

        boolean f = map.containsValue(10);
        System.out.println(f);

        boolean empty = map.isEmpty();
        System.out.println(empty);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.size());

        System.out.println("------------------------------");
        Set<Integer> set = map.keySet();
        for(Integer key : set) {
            System.out.println(key);
            System.out.println(set.contains(key));
        }


        map.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("-----------------------");
        //通过键值对对象进行遍历

        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entries) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.println("----------------------------");
        //Map集合的第三种遍历方式

        //lambda
        map.forEach((k,v) -> System.out.println(k + ":" + v));

    }
}
