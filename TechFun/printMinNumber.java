package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printMinNumber {

    public static void TestInput() {
        String input = "11 44 5 2 77 -33\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {

        TestInput();
        Scanner scaner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scaner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer> ,Integer> getMinNum = list -> Collections.min(list);

        System.out.println(getMinNum.apply(nums));



    }
}
