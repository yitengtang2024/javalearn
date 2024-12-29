package com.yiteng;

import java.util.Scanner;

public class calculateScore {
    public static void main(String[] args) {
        //define arr to stoere the score, there are 6 score, use scanner
        int[] scores = new int[6];
        for(int i=0;i<6;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("The "+i+1 +" Score is: ");
            int score = scanner.nextInt();
            scores[i] = score;

        }
//        for (int i = 0; i < scores.length; i++) {
//            System.out.print(scores[i] +", ");
//
//        }

        //score is calculate by removing the largest and minimun number first
        //then cal AVG

        int max = getMax(scores);
        int min = getMin(scores);
        int avg = getAverage(scores, max, min);
        System.out.println("avg score is " + avg);

    }
    //getMax
    public static int getMax(int[] scores){
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }

        }
        return max;
    }

    //getMin
    public static int getMin(int[] scores){
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] < min){
                min = scores[i];
            }
        }
        return min;
    }

    //cal AVG
    public static int getAverage(int[] scores,int max, int min){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = (sum-max-min)/4;
        return avg;
    }
}
