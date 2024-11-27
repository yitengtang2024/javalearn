package com.yiteng.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);

       for (int i = 0; i < cars.length; i++) {
           cars[i] = new Car();
           System.out.println("Please enter the brando of car"+ (i+1)+": ");
           cars[i].setBrand(sc.next());
           System.out.println("Please enter the price of car"+ (i+1)+": ");
           cars[i].setPrice(sc.nextDouble());
           System.out.println("Pleae enter the color of car"+ (i+1)+": ");
           cars[i].setColor(sc.next());
       }
        for (Car car : cars) {
            System.out.println(car.toString());
        }


    }
}
