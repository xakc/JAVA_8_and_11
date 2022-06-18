package com.n3;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void TestInput() {
        String input = "10"
               ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }
    public static void main(String[] args) {
        TestInput();

        Scanner s = new Scanner(System.in);
        int input  = Integer.parseInt(s.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        if (input=0) {
            System.out.print(0);
        }

        while (input>0){
            stack.push(input % 2);
            input /=2;
        }

        int  stackSize = stack.size();
        for (int i = 0; i <stackSize ; i++) {
            System.out.print(stack.pop());
        }


        System.out.println(input);
    }
}
