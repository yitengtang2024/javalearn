package com.yiteng.a06_mysettest;

import java.util.TreeSet;

public class TreeSetDemo {
    /*  需求：创建5个学生对象
        属性：(姓名,年龄，语文成绩,数学成绩,英语成绩),
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。

        第一种：默认排序/自然排序
        第二种：比较器排序

        默认情况下，用第一种排序方式，如果第一种不能满足当前的需求，采取第二种方式。


        课堂练习：
            要求：在遍历集合的时候，我想看到总分。

      */
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("zhangsan", 23, 90,88,85);
        Student s2 = new Student("lisi", 22, 99,78,95);
        Student s3 = new Student("wangwu", 24, 60,98,75);
        Student s4 = new Student("zhaoliu", 21, 80,68,95);
        Student s5 = new Student("qianqi", 25, 70,58,55);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students);

        students.forEach(System.out::println);
        students.forEach(s -> System.out.println(s));

    }
}
