package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void TestInput() {
        String input = "Hello World in that fucking good working space\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("\\s+");

        TreeMap<Character,Integer> symbolsCount = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            for (int j = 0; j < word.length(); j++) {
                char currentSymbol = word.charAt(j);

                if (symbolsCount.containsKey(currentSymbol)) {
                int currentIndexCount = symbolsCount.get(currentSymbol);
                symbolsCount.put(currentSymbol,currentIndexCount+1);
                } else {
                    symbolsCount.put(currentSymbol,1);
                }

            }
        }

        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()+" time/s"));
        System.out.println("The End");

    }
}
