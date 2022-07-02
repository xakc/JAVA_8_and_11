package com.n3.Streams;

import java.io.*;
import java.util.Set;

public class DoTheMagic {

    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        BufferedWriter writer = new BufferedWriter(new PrintWriter("out.txt"));

        String line = reader.readLine();
        int count = 1;
        while (line !=null) {
            if (count%3 == 0) {
                System.out.printf(line);

            }
            count++;
        }

        Buff


    }
}
