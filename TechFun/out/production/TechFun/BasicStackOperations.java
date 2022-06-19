package com.n3;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {

    public static void TestInput() {
        String input = "5 2 13\n"+
                        "1 13 45 32 4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        int numsToPush = s.nextInt();
        int numsToPop = s.nextInt();
        int lookUpNums = s.nextInt();


        ArrayDeque<Integer> nums = new ArrayDeque<>();

        String[] input = s.nextLine().split("\\s+");

        for (int i = 0; i < numsToPush ; i++) {
            // nums.push(Integer.parseInt(input[i]));
            nums.push(s.nextInt());
        }

        for (int i = 0; i < numsToPop; i++) {
            nums.pop();
        }

        if (nums.contains(lookUpNums)){
            System.out.println("true");
        } else {
            if (!nums.isEmpty()) {
            System.out.println(Collections.min(nums));
            } else {
                System.out.println(0);
            }
        }

      //  System.out.println("End");

    }
}
