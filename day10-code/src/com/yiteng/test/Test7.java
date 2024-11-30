package com.yiteng.test;

public class Test7 {
    public static void main(String[] args) {
        String s = "   Hello world    ";
        System.out.println(s);
        String lastWordR = getWord(s);
        String lastWord = getWord(lastWordR);
        System.out.println(lastWord);
        System.out.println(lastWord.length());

    }
    private static String getWord(String str){
        StringBuilder sb = new StringBuilder();
        while(true){
            for (int i = str.length()-1; i >=0; i--) {
                sb.append(str.charAt(i));
                if(str.charAt(i) != ' '&& str.charAt(i-1) == ' ' ){
                    return sb.toString();
                }
            }
        }
    }
}
