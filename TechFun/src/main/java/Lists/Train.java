package Lists;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Train {
    public static void TestInput() {
        String input = "32 54 21 12 4 0 23\n" +
                "75\n" +
                "Add 10\n" +
                "Add 0\n" +
                "30\n" +
                "10\n" +
                "75\n" +
                "end\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> wagons = Arrays.stream(reader.readLine()
                                                .split("\\s+"))
                                                .map(Integer::parseInt)
                                                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(reader.readLine());

        String[] inputData = reader.readLine().split("\\s+");

        System.out.println("Start here");
        while (!"end".equals(inputData[0])){

            if (inputData[0].equals("Add")){
               wagons.add(Integer.parseInt(inputData[1]));
            } else {
                for (int i = 0; i < wagons.size() ; i++) {
                    int passengers = Integer.parseInt(inputData[0]);
                    int currentTravelers = wagons.get(i);
                    boolean isEnoughPlacesForPassengers = passengers + currentTravelers <= maxCapacity;
                        if (isEnoughPlacesForPassengers) {
                           wagons.set(i,(passengers+currentTravelers));
                           break;
                        }
                    }
                }
            inputData = reader.readLine().split("\\s+");
            }

        System.out.println("The end ");
        System.out.println(wagons.toString().replaceAll("\\[|,|\\]",""));

        }





}
