package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void TestInput() {
        String input = "1 2 3 4 5\n"+
                "add\n"+
                "add\n"+
                "print\n"+
                "end\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();

        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number +=1).toArray();
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(number -> number -=1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number *=2).toArray();
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(number -> System.out.print(number+" "));

        while (!input.equals("end")) {
            int[] nums = (Integer[]) Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray();
            String command = scanner.nextLine();

            switch (input) {
                case "add":
                    nums = add.apply(nums);

                    break;
                case "multiply":
                    nums =  multiply.apply(nums);

                    break;
                case "subtract":
                    nums =  subtract.apply(nums);

                    break;
                case "print":
                    print.accept(nums);
                    break;


            }


            input = scanner.nextLine();
        }


    }
}
