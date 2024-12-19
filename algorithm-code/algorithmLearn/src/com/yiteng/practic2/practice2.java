package com.yiteng.practic2;
/*
*undead rabbits
* one pairs of new born rabit can have a new pair of rabbit every month after 3 month
* suppose, the rabbits will not die
* how many pairs after 12 months
*
 */

public class practice2 {
    public static void main(String[] args) {
        System.out.println(fibonacci(12));

    }
    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
