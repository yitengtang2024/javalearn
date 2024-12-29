package com.yiteng;
/*
*optimize the algorithm
* instead give the random index
* now we randmize the prize pool {2,588,888,1000,10000}
* then we print the prizepoll
 */

import java.util.Random;

public class randomPrizeOptimize {
    public static void main(String[] args) {
        int[] prizePool={2,588,888,1000,10000};
        prizePool = randomPrizePool(prizePool);
        printPrizePool(prizePool);
    }
    public static int[] randomPrizePool(int [] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
    public static void printPrizePool(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The $"+arr[i]+" is selected!");

        }
    }
}
