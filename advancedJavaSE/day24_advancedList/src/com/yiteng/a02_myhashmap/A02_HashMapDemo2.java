package com.yiteng.a02_myhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
                /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        //1.需要先让同学们投票
        //定义一个数组，存储4个景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        Random r = new Random();
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> vote = new HashMap<>();

        //init the vote HashMap
        vote.put("A", 0);
        vote.put("B", 0);
        vote.put("C", 0);
        vote.put("D", 0);

        //add a scanner that can input the vote results
        Scanner sc = new Scanner(System.in);

        int voteNumber = 0;

        while(voteNumber < 5){
            System.out.println("Please enter number of your selections:");
            System.out.println("1. A");
            System.out.println("2. B");
            System.out.println("3. C");
            System.out.println("4. D");
            System.out.println("Here is your selections: ");
            int selection = sc.nextInt();
            if(selection == 1){
                vote.merge("A",1,(oldValue, newValue)-> oldValue + newValue);
                voteNumber++;
            }
            else if(selection == 2){
                vote.merge("B",1,(oldValue, newValue)-> oldValue + newValue);
                voteNumber++;
            }
            else if(selection == 3){
                vote.merge("C",1,(oldValue, newValue)-> oldValue + newValue);
                voteNumber++;
            }
            else if(selection == 4){
                vote.merge("D",1,(oldValue, newValue)-> oldValue + newValue);
                voteNumber++;
            }
            else{
                System.out.println("Invalid selection");
            }
        }
        System.out.println("Final votes: "+ vote);
    }
}
