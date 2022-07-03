package com.n3.Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class FormatAllCapitals {
    public static void main(String[] args) throws IOException {

        String pathAsString = "z:\\My\\Demo\\InputFiles";
        BufferedWriter  writer = new BufferedWriter(new FileWriter("output.txt"));

        Files.readAllLines(Path.of(pathAsString)).forEach(
                line -> {
                    try {
                        writer.write(line.toLowerCase());
                        writer.newLine();
                    } catch (IOException e){
                        e.printStackTrace();;
                    }
                }
        );
        writer.close();
    }
}
