package Lists;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists {
    public static void TestInput() {
        String input = "1 2 3 4 5\n" ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> firstNums = Arrays.stream(reader.readLine().split("\\s+"))
                                            .map(Integer::parseInt)
                                            .collect(Collectors.toList());


        List<Integer> secondNums = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

       int minLenght = Math.min(firstNums.size(),secondNums.size());

        for (int i = 0; i < minLenght; i++) {
            int numFromFirstList = firstNums.get(i);
            int numFromSecondList = secondNums.get(i);
            int sum = numFromFirstList+ numFromSecondList;
            resultList.add(sum);
        }

        if (firstNums.size()>secondNums.size()){
            resultList.addAll(firstNums.subList(minLenght,firstNums.size()-1));
        } else {
            resultList.addAll(secondNums.subList(minLenght,secondNums.size()));
        }

        System.out.println(resultList.toString().replaceAll("\\[|,|\\]",""));
    }
}
