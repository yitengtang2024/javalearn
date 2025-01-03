package com.yiteng.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //三个课堂练习：
        //
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");

        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.println(key + ": "+map.get(key));
        }
        System.out.println("-----------------------");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
        System.out.println("---------------------");

        map.forEach((k,v) -> System.out.println(k+ ": "+ v));
        set.forEach(key -> System.out.println(key + ": " + map.get(key)));


    }
}
