package com.yiteng;

import java.util.Scanner;

public class primenumberCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start point(int great than 0):");
        int start = sc.nextInt();
        System.out.println("End point(int great than 0):");
        int end = sc.nextInt();
        int count = countPrime(start, end);
        System.out.println(count);

    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            return false;

        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0) {
                return false;
            }
        }
        return isPrime;

    }
    public static int countPrime(int start, int end) {
        int count = 0;
       for (int i = start; i <= end; i++) {
           if (isPrime(i)) {
               count++;
           }
       }
       return count;
    }
}
