package com.yiteng.demo1;
/*
*replace some key word in a string by ***
 */
public class StringDemo7 {
    public static void main(String[] args) {
        //DEFINE an array that we want to replace by ***
        String[] arr={"TMD", "CNM", "SB", "MLGB"};
        String talk ="You are a good player, CNM!";
        System.out.println(talk);
        String talkReplace = talk.replace("TMD","***");
        System.out.println(talkReplace);
        //use a loop to find all the arr string and replace it
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");

        }
        System.out.println(talk);

    }
}
