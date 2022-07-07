package com.n3.FunctionaPrograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestElementInArr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> String = Arrays.stream(
                s.nextLine()
               .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> getIndexOFMinEl =
                list -> list.lastIndexOf(Collections.min(list));

    }
}
