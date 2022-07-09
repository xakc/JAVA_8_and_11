package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void TestInput() {
        String input = "The following example shows how to use Predicate\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split("\\s+");
        Predicate<String> predicate = str -> Character.isUpperCase(str.charAt(0));
        List<String> upperCaseStrings = Arrays.stream(input)
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings.size());
        System.out.println(String.join(System.lineSeparator(), upperCaseStrings));
    }
}
