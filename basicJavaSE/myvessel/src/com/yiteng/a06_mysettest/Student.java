package com.yiteng.a06_mysettest;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student(){}

    public Student(String name, int age, int chinese, int math, int english){
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        int sum1 = this.chinese + this.math + this.english;
        int sum2 = other.chinese + other.math + other.english;
        int i = sum1 - sum2;
        i = i == 0? this.chinese - other.chinese:i;
        i= i == 0? this.math - other.math:i;
        i= i ==0? this.english - other.english:i;
        i = i == 0? this.age - other.age:i;
        i= i ==0? this.name.compareTo(other.name):i;


        return i;
    }
}
