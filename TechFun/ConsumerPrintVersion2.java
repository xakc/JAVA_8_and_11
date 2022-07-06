package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrintVersion2 {

    public static void TestInput() {
        String input = "Peter George Alex\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {

        TestInput();
        Scanner scaner = new Scanner(System.in);
        String[] names = scaner.nextLine().split("\\s+");

        Consumer<String[]> printNames = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };

        printNames.accept(names);
    }
}
