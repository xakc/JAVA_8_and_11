package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void TestInput() {
        String input = "1.38, 2.56, 4.4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        UnaryOperator<Double> vatCalculator = val -> val * 1.20;
        System.out.println("Prices with VAT:");

        Arrays.stream(s.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(vatPrice -> System.out.printf("%.2f%n",vatPrice));


    }
}
