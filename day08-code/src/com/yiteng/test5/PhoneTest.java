package com.yiteng.test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Phone();
            System.out.println("Enter the phone brand: ");
            phones[i].setBrand(scanner.next());
            System.out.println("Enter the phone price: ");
            phones[i].setPrice(scanner.nextDouble());
            System.out.println("Enter the phone color: ");
            phones[i].setColor(scanner.next());
        }
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        System.out.println("Sum: " + sum);
        double avg = sum / phones.length;
        System.out.println("Average price: " + avg);
    }
}
