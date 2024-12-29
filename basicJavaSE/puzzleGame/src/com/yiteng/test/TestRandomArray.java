package com.yiteng.test;

import java.util.Arrays;
import java.util.Random;

public class TestRandomArray {
    public static void main(String[] args) {
        int[] temp = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        int tempNum = temp[15];
        for (int i = temp.length-1; i >0; i--) {
            int randomNum = random.nextInt(i);
            temp[i] = temp[randomNum];
            temp[randomNum] = tempNum;
            tempNum = temp[i-1];

        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");

        }
        // temp2D[i/4}[i%4] for one for loop to add the data to the 2D array
        int[][] temp2D = new int[4][4];
        int count = 0;
        for (int i = 0; i < temp2D.length; i++) {
            for (int j = 0; j < temp2D[0].length; j++) {
                temp2D[i][j] = temp[count];
                count++;
            }

        }

        for (int[] ints : temp2D) {
            System.out.println(Arrays.toString(ints));

        }
    }
}
