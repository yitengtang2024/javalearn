package com.yiteng;
/*
*documentation: the flight ticket is sale for hot season and cold season
* in hot season (5- 10) the first class is 90% discount, the economy is 85%
* in cold season (11-4) the first class i 70% and economy is 65%
 */

import java.util.Scanner;

public class flightTicket {
    public static void main(String[] args) {
        // let user input the ticket and seats and month
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the ticket price: ");
        int ticketPrice = sc.nextInt();
        System.out.println("Please input the seats class(0 for first class, 1 for economy): ");
        int seatsClass = sc.nextInt();
        System.out.println("Please input when the flight going: ");
        int month = sc.nextInt();
        int finalTickt = 0;
        // condition to deterime the season according to the month
        if (month >= 5 && month <= 10) {
            //hot season 90% first, 85% economy
            finalTickt = getTicketPrice(seatsClass, ticketPrice, 0.9, 0.85);

        } else if((month > 0 && month <= 4) || (month > 10 && month <= 12)) {
            finalTickt = getTicketPrice(seatsClass, ticketPrice, 0.7, 0.65);

        }else{
            System.out.println("Month number should between 1 and 12.");
        }
        System.out.println("You ticket price is "+ finalTickt);

    }
    public static int getTicketPrice(int seatsClass, int ticketPrice, double firstclassdiscount, double economydiscount){
        if (seatsClass == 0) {
            ticketPrice = (int) (ticketPrice * firstclassdiscount);
        }
        else if(seatsClass == 1) {
            ticketPrice = (int) (ticketPrice * economydiscount);
        }else{
            System.out.println("There is no this kind of seats, please input 0 for first class or 1 for economy");
        }
        return ticketPrice;
    }

}
