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

        int multiplier = switch (season) {
            case "Autumn" -> 1;
            case "Spring" -> 2;
            case "Winter" -> 3;
            case "Summer" -> 4;

            default -> throw new IllegalArgumentException("No such season" + season);
        };



    }
}
