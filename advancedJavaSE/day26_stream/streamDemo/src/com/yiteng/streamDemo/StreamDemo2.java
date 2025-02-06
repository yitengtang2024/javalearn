package com.yiteng.streamDemo;

import java.util.Arrays;

public class StreamDemo2 {
    public static void main(String[] args) {
        int[][] studentsGrades ={
                {85,90,75},
                {95,85,80},
                {88,92,85}
        };

        //convert 2D array to stream and process
        //calculate the average score
        System.out.println("Students Average Score:");
        Arrays.stream(studentsGrades).map(studentScore -> Arrays.stream(studentScore).average().orElse(0.0))
                .forEach(avg -> System.out.println("Average: "+ avg));

        //find higheset grade in any subset
        int maxGrade = Arrays.stream(studentsGrades).flatMapToInt(Arrays::stream)
                .max()
                .orElse(0);
        System.out.println("Highest Score:"+maxGrade);
    }
}
