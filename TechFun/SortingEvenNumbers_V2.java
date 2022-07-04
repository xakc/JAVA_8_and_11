package com.n3.FunctionaPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingEvenNumbers {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);

        String[] strings = s.nextLine().split("\\s+");

        List<Integer> nums = Arrays.stream(strings).
                map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNums = nums.stream()
                .filter(e -> e %2 ==0)
                .collect(Collectors.toList());

        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf)
                                            .collect(Collectors.joining()", ");

        String firstOutpit = mutator.apply(evenNums.stream());
        System.out.println(firstOutpit);

        String secondOutput =  mutator.apply(evenNums.stream());
        System.out.println(secondOutput);

    }
}
