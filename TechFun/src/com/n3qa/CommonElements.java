package com.n3qa;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {

    public static void TestInput() {
        String input = "5\n" +
                "2\n" +
                "2 \n" +
                "8 \n" +
                "4 \n" +
                "6 \n" +
                "5 \n" +
                "2 \n";



        System.setIn( new ByteArrayInputStream(input.getBytes()));

    }
    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] arr  = reader.readLine().split("\\s+");
        String[] num = reader.readLine().split("\\s+");




    }
}
