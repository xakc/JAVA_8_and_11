package com.n3qa;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZigZagArrays {
    public static void TestInput() {
        String input = "3\n" +
                "1,2,3,4,5\n" +
                "1,2,8,9,9\n" +
                "1,2,2,3,2\n" ;


        System.setIn( new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] input = Arrays.stream( reader.readLine().split("\\s+").mapToInt(e->Integer.parseInt(e)).toArray());

        //
        int rowCounts = Integer.parseInt(reader.readLine());

        for (int i = 0; i < rowCounts; i++) {
            String[] inputData = reader.readLine().split("\\s+");



        }

    }

}
