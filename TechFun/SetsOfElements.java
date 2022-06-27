package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void TestInput() {
        String input = "4 3\n"+
                "1\n"+
                "3\n"+
                "5\n"+
                "7\n"+
                "3\n"+
                "4\n"+
                "5\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s  = new Scanner(System.in);

        String[] input = s.nextLine().split("\\s+");
        int countFirstSet = Integer.parseInt(input[0]);
        int countSecondSet = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i <countFirstSet  ; i++) {
            int num = Integer.parseInt(s.nextLine());
            set1.add(num);
        }

        for (int i = 0; i < countSecondSet; i++) {
            int num = Integer.parseInt(s.nextLine());
            set2.add(num);
        }

        LinkedHashSet<Integer> dubEls = new LinkedHashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                dubEls.add(num);
            }
        }


    }



}
