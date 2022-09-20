package com.n3.Encapsulation;

import java.util.Scanner;

public class MainBookingDiscount {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split("\\s+");

        double priceDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];
        double multiplier = 1;

        switch (season) {
            case "Autumn":
                multiplier = 1;
                break;
            case "Spring":
                multiplier = 2;
                break;
            case "Winter":
                multiplier=3;
                break;

            case "Summer":
                multiplier=4;
                break;

            default:
                throw new IllegalArgumentException("There is no such "+season);
        };

        double percentDiscount = 0;

        if (discountType.equals("VIP")) {
            percentDiscount=20;
        } else  if (discountType.equals("SecondVisit")) {
            percentDiscount=10;
        }

        double totalPrice = priceDay * numberOfDays * multiplier (1-percentDiscount)

        //have to fix it    
    }
}
