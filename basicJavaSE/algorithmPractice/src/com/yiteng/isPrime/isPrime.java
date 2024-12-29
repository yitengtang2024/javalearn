package com.yiteng.isPrime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));

    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0 || n%3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n) ; i+=6) {
            if (n % i == 0||n%(i+2) ==0) return false;// alternatively can be used as i =3 , i+=2

        }
        return true;
    }
}
