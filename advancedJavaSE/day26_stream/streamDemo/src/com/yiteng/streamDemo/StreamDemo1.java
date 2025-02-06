package com.yiteng.streamDemo;

import java.util.Arrays;

public class StreamDemo1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        int[] scores ={95,85,75,90,88};

        Arrays.stream(scores)
                .forEach(score -> System.out.println(score +" "));
        //calculate average
        double average = Arrays.stream(scores)
                .average()
                .orElse(0.0);
        System.out.println("Average score: " + average);

        //filter score above 85
        int[] highScores = Arrays.stream(scores).
                filter(score -> score > average).
                sorted().
                toArray();
        System.out.println("the score above average: "+ Arrays.toString(highScores));
    }
}
