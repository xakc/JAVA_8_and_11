package com.n3.Encapsulation.SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<PersonSort> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            people.add(new PersonSort(input[0],"NoProvided",input[2],Double.parseDouble(input[3])));
        }

        Collections.sort(people, (firstPerson,secondPerson) -> {
            int isComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (isComp!=0) {
                return isComp;
            }else {
                return Double.compare(firstPerson.getAge(), secondPerson.getAge());
            }

        });

        for (PersonSort person : people) {
            System.out.println(person.toString());
        }

    }
}
