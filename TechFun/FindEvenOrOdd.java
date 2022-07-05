package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenOrOdd {

    public static void TestInput() {
        String input = "1 10\n"+
                "odd\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        int[] range = Arrays.stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = s.nextLine();

        printNumbersIn(range[0],range[1]
                ,condition.equals("even") ?
                n -> n % 2 == 0
                : n -> n % 2 != 0);

    }

    private static  void printNumbersIn(int startInclusive, int endInclusive, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(startInclusive,endInclusive)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }



}
