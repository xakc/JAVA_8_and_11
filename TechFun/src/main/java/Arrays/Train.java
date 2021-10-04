package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Train {
    public static void TestInput() {
        String input = "3\n" +
                "13\n" +
                "24\n" +
                "8\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wagons = Integer.parseInt(reader.readLine());

        int[] people = new int[wagons];
        int totalPeopleInWagon = 0;

        for (int i = 0; i < people.length ; i++) {
            people[i]= Integer.parseInt(reader.readLine());
            totalPeopleInWagon+=people[i];
        }

        System.out.println(totalPeopleInWagon);
        System.out.println("the end");

    }
}
