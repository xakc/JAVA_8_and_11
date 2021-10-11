package Lists;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Train {
    public static void TestInput() {
        String input = "Hey hello 2 4\n" +
                "10 hey 4 hello\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String input = reader.readLine();

        List<Integer> stringList = Arrays
                                        .stream(input.split("\\s+"))
//                                        .filter( s->)
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());




    }
}
