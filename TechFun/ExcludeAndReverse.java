package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExcludeAndReverse {
    public static void TestInput() {
        String input = "1 2 3 4 5 6\n"+
                "2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Integer> nums = (List<Integer>) Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> checkDivision = num -> num % 2 ==0;
        Collections.reverse(nums);
        nums.removeIf(checkDivision);

        nums.forEach( number -> System.out.print(number+ " "));

    }
}
