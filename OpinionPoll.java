package com.n3.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<People> persons = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String peopleInfo = scanner.next();
            String[] input = peopleInfo.split("\\s+");
            String name = input[0];

            int age = Integer.parseInt(input[0]);

            People people = new People(name,age);
            persons.add(people);

        }

        persons
                .stream()
                .filter(p -> p.getAge() >30)
             //   .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .sorted(Comparator.comparing(People::getName))
                .forEach(System.out::println);
    }


}
