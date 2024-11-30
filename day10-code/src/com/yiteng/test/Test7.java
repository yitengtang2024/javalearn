package com.yiteng.test;

public class Test7 {
    public static void main(String[] args) {
        String s = "   Hello world";
        System.out.println(s);

        String lastWord = getWord(s);
        System.out.println(lastWord);
        System.out.println(lastWord.length());

    }
    private static String getWord(String str){
        StringBuilder sb = new StringBuilder();
        int i = str.length()-1;
        while(i>=0 && str.charAt(i)==' '){
            i--;
        }
        while(i>=0 && str.charAt(i)!=' '){
            sb.append(str.charAt(i));
            i--;
        }
        return sb.toString();
    }
}
