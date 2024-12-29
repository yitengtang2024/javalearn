package com.yiteng;

import java.util.Random;
import java.util.Scanner;

/*
*Doulbe ball prize system
* There are two balls (6 Red and 1 Blue)
* Red ball number range (1-33)
* Blue ball number range (1-16)
* Prize Pool
* 1st class 6 Red +1 Blue $10billion
* 2nd class 6 Red +0 Blue $5 billion
* 3rd class 5 Red + 1Blue $3000
* 4th class 5 Red + 0 blue $200
* 4th class 4 Red + 1 Blue $200
* 5th class 4 Red + 0 Blue $10
* 5th class 3 Red + 1 Blue $10
* 5th class 2 Red + 1 Blue $10
* 6the class 2 Red + 1 Blue $5
* 6the class 1 Red + 1 Blue $5
* 6the class 0 Rd + 1 Blue $5
 */
public class doubleBallPrize {
    public static void main(String[] args) {
        int[] prizePool =generatePrizePool();
        printArray(prizePool);
        System.out.println();
        int[] userSelection = getSelection();
        printArray(userSelection);
        System.out.println();
        int[] mathResult = prizeMatch(prizePool, userSelection);
        printArray(mathResult);
        System.out.println();
        checkPrize(mathResult);

    }
    // create the random prize pool
    public static int[] generatePrizePool(){
        int[] prizePool = new int[7];
        Random random = new Random();
        for (int i = 0; i < prizePool.length-1; i++) {
            prizePool[i] = random.nextInt(1,34);

        }
        prizePool[prizePool.length-1] = random.nextInt(1,17);
        return prizePool;
    }
    // print a arr
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    // collect the user selection number
    public static int[] getSelection(){
        Scanner sc = new Scanner(System.in);
        int[] userSelection = new int[7];
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter the "+ (i+1)+" red ball number: ");
            int number = sc.nextInt();
            userSelection[i] = number;
        }
        System.out.println("Plese enter the blue ball number: ");
        int number = sc.nextInt();
        userSelection[userSelection.length-1] = number;
        return userSelection;
    }
    //determin the number of red ball and blue ball that are matched
    public static int[] prizeMatch(int[] prizePool, int[] userSelection){
        int redballCount = 0;
        int blueballCount = 0;
        int[] rebbluemath= new int[2];
        boolean[] matchBoolean = new boolean[6];// solve the duplicated number in the prize Pool
        for (int i = 0; i < prizePool.length-1; i++) {
            for (int j = 0; j < userSelection.length-1; j++) {
                if (userSelection[j] == prizePool[i] && matchBoolean[j] == false) {
                    redballCount++;
                    matchBoolean[j] = true;
                }
            }
        }
        if(userSelection[6] == prizePool[6]){
            blueballCount++; }
        rebbluemath[0] = redballCount;
        rebbluemath[1] = blueballCount;
        return rebbluemath;
    }
    // check the prize earned
    public static void checkPrize(int[] arr){
        if(arr[0] == 6 && arr[1] == 1){
            System.out.println("Congratulation, your earn First class prize with 10 millions");
        }else if(arr[0] == 6 && arr[1] == 0||arr[0]==5 && arr[1] == 1){
            System.out.println("Congratualtion, you earn Second class prize with 5 millions");
        }else if(arr[0] == 5 && arr[1] == 0 || arr[0]==4 && arr[1] == 1){
            System.out.println("Congratualtion, you earn Third class prize with 3000");
        }else if(arr[0] == 4 && arr[1] == 0 || arr[0]==3 && arr[1] == 1){
            System.out.println("Congratualtion, you earn Fourth class prize with 200");
        }else if(arr[0] == 3 && arr[1] == 0 || arr[0]==2 && arr[1] == 1){
            System.out.println("Congratualtion, you earn Fifth class prize with 10");
        }else if(arr[0] == 2 && arr[1] == 0 || arr[0]==1 && arr[1] == 1||arr[0]==0 && arr[1]==1){
            System.out.println("Congratualtion, you earn Sixth class prize with 5");
        }
    }
}
