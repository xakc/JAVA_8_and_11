package Lists;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GausTrick {
    public static void TestInput() {
        String input = "1 2 3 4 5\n" ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays
                                .stream(reader.readLine().split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int initialSize = nums.size()/2;

        for (int i = 0; i < initialSize; i++) {
            int firstNum = nums.get(i);

            int lastNumIndex = (nums.size()-1);
            int lastNum = nums.get(lastNumIndex);

            nums.set(i, firstNum+lastNum);
            nums.remove(lastNumIndex);
        }

        System.out.println(nums.toString().replaceAll("\\[|,|\\]",""));
    }
}
