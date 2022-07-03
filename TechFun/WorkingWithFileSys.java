package com.n3.Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WorkingWithFileSys {

    public static void main(String[] args) throws IOException {

        Path pathStr = Paths.get("z:my\tricky\folder\input.txt");
        Path path = Path.of(pathStr);

        List<String> allLines = Files.readAllLines(path);

        for (String line : allLines) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum+=currentSymbol;
            }
        }

        allLines.stream().map(line -> line.toCharArray()).

    }
}
