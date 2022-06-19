package com.n3;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumsWithStack {

    public static void TestInput() {
        String input = "1 2 3 4 5 6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(s.nextLine().split("\\s+"))
                .forEach(stack::push);

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
