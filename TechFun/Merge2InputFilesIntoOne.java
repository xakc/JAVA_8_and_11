package com.n3.Streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Merge2InputFilesIntoOne {
    public static void main(String[] args) throws IOException {
        Path pathFileOne = Path.of("z:\\some\\file\\here");
        Path pathFileTwo = Path.of("z:\\some\\file\\here");

        List<String> allLinesFirstFile = Files.readAllLines(pathFileOne);
        List<String> allLinesSecondFile = Files.readAllLines(pathFileTwo);

        PrintWriter writer = new PrintWriter("merged.txt");
        allLinesFirstFile.forEach(writer::println);
        allLinesSecondFile.forEach(writer::println);

        writer.close();
    }
}
