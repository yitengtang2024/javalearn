package com.yiteng.util;

import java.util.Random;

public class CodeUtil {
    public static String getCode(){
        Random random = new Random();
        String[] codeList = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F",
                "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(codeList.length);
            sb.append(codeList[index]);

        }
        return sb.toString();
    }
}
