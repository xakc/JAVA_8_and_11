package com.n3.Streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) {
        String pathAsString = "z:\\My\\Demo\\InputFiles";
        byte[] allBytes = Files.readAllBytes(Path.of(pathAsString));
        long sum = 0;

        for (byte value : allBytes) {
            if (value!= 10 && value !=33) {
                sum +=value;
            }
        }
        System.out.println(sum);
    }

}
