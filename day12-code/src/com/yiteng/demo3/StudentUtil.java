package com.yiteng.demo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }


    public static int getElder(ArrayList<Student> students) {
        int elder = 0;
        for (Student student : students) {
            if (student.getAge() > elder) {
                elder = student.getAge();
            }
        }
        return elder;
    }
}
