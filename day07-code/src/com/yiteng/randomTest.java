package com.yiteng;

import java.util.Random;

/*
*random generate a auth code that composed by 4 letters and 1 digit
 */
public class randomTest {

    public static void main(String[] args) {
       //create arry for capital A-Z and a-z
        char [] chars = new char[52];
        String result="";
        for (int i = 0; i < chars.length; i++) {
            if(i<26){
                chars[i] = (char)(65+i);


            }else{
                chars[i]=(char)(97+i-26);
            }

        }
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
        Random random = new Random();
        for(int i=0; i<4;i++){
            int num= random.nextInt(chars.length);
            result+=chars[num];
        }
        int number = random.nextInt(10);
        result+=number;
        System.out.println(result);
    }
}
