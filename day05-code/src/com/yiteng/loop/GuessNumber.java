package com.yiteng.loop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();

        int randomInt = r.nextInt(100);
        boolean flag = false;

        Scanner sc = new Scanner(System.in);

        while (flag == false) {
            System.out.println("Please eneter a number between 0-99:");
            int guess = Integer.parseInt(sc.nextLine());
            if (guess == randomInt) {
                System.out.println("You guessed correctly!");
                flag = true;
            } else if (guess > randomInt) {
                System.out.println("You guessed higher!");
            } else if (guess < randomInt) {
                System.out.println("You guessed lower!");
            }

        }
    }
}
