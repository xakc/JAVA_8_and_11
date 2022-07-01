package com.n3.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class FileInputReading {

    public static void main(String[] args) throws IOException {

        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int value = inputStream.read();

        Set<Character> puntuations = Set.of(' ','!','?','.');

        while (value!=-1) {
            char current = (char) value;

            if (!puntuations.contains(current)) {
                System.out.println(current);
            }
        }

        value = inputStream.read();

    }
}
