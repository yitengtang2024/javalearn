package com.yiteng.a02_myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_HashMapDemo2 {
   /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生

        核心点：
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
       */
   public static void main(String[] args) {
       HashMap<Student2,String> map = new HashMap<>();

       Student2 s1 = new Student2("zhangsan", 18);
       Student2 s2 = new Student2("lisi", 19);
       Student2 s3 = new Student2("wangwu", 20);
       Student2 s4 = new Student2("zhaoliu", 21);
       Student2 s5 = new Student2("zhaoliu", 21);
       map.put(s1,"shandong");
       map.put(s2,"jiangsu");
       map.put(s3,"shanghai");
       map.put(s4,"shanghai");
       map.put(s5,"shanghai");
       map.forEach((k,v)->System.out.println(k +": "+ v));
       System.out.println("---------------------------------");
       for (Map.Entry<Student2, String> student2StringEntry : map.entrySet()) {
           String key = student2StringEntry.getKey().getName();
           String value = student2StringEntry.getValue();
           System.out.println(key + ": " + value);
       }
       System.out.println("----------------------------------");
       Set<Student2> keys = map.keySet();
       for (Student2 student2 : keys) {
           String value = map.get(student2);
           System.out.println(student2 + ": " + value);
       }

   }
}
