package com.yiteng;
/*
*random choose the prize from the prize poll {2,588,88,1000,10000}
* the out put live below
* 10000 is selected
* 5888 is selected
* 1000 is selected
* 888 is slected
* 2 is selected
* the sequence is random, there is not repeated prize selected
 */

import java.util.Random;

public class randomPrize {
    public static void main(String[] args) {
        int[] prizePool={2,588,888,1000,10000};
        int count=0;
        int prize=0;
        Random random=new Random();
        int[] selectedPool = new int[prizePool.length];
        boolean flag=false;
        while (count<prizePool.length){
            int prizeNumber = random.nextInt(prizePool.length);
            int prizeSelected = prizePool[prizeNumber];
            flag = isChoose(prizeSelected,selectedPool);
            if (flag == false){
                System.out.println("Seleteced prize is $"+ prizeSelected);
                selectedPool[count] = prizeSelected;
                count++;
            }

        }
    }
    public static boolean isChoose(int prizeNumber, int[] prizeSelectedPool){
        boolean flag = false;
        for (int i = 0; i < prizeSelectedPool.length; i++) {
            if (prizeNumber==prizeSelectedPool[i]){
                flag = true;
            }
        }
        return flag;
    }



}
