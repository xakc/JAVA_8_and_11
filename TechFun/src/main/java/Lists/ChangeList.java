package Lists;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList {

    public static void TestInput() {
    String input = "1 2 3 4 5 5 5 6\n" +
            "Delete 5\n" +
            "Insert 10 1\n" +
            "Delete 5\n" +
            "end\n";
    System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commands = reader.readLine().split("\\s+");

        while (!commands[0].equals("end")) {
            switch (commands[0]){

                case "Delete":
                    int number = Integer.parseInt(commands[1]);

                    nums = nums.stream()
                            .filter((e->!e.equals(number)))
                            .collect(Collectors.toList());
                    break;

                case "Insert":
                    number = Integer.parseInt(commands[1]);
                    int position = Integer.parseInt(commands[2]);
                    nums.add(position,number);
                    break;
            }


            commands = reader.readLine().split("\\s+");
        }

        System.out.println(nums.toString().replaceAll("\\[|,|\\]",""));
    }

}
