package com.yiteng.demo1;

import java.util.Scanner;

/*
*block display the cellphone number
* input 4445556789
* display ******6789
 */
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cellNumber ="";
        while (true) {
            System.out.println("Please enter the 10 digit cell number:");
            cellNumber = scanner.nextLine();
            if(cellNumber.length() == 10){
                break;
            }else{
                System.out.println("Please inter a valid cell number 10 digit");
            }
        }
        String lastFour = cellNumber.substring(6,10);
        String blockDisplay = "***-***-"+lastFour;
        System.out.println(blockDisplay);
    }
}
