package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

    public static void TestInput() {
        String input = "Peter George Alex\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {

        TestInput();
        Scanner scaner = new Scanner(System.in);
        String[] names = scaner.nextLine().split("\\s+");

        Consumer<String> printName = name -> System.out.println(name);

        for (String name : names) {
            printName.accept(name);
        }


    }
}
