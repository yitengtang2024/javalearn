package com.yiteng.practice3;
/*
*a monkey has a bucket of peach
* the first day he eat half of the bucket and one extra
* the rest days, everyday he eat half of the rest and an extra one
* on day 10, before eat, there are only 1 left
* so the total number of the peaches?
 */

public class Practice3 {
    public static void main(String[] args) {
        System.out.println(getSum(10));

    }
    public static int getSum(int days){
        if (days == 1){
            return 1;
        }
        else {
            return 2*(getSum(days-1)+1);
        }
    }
}
