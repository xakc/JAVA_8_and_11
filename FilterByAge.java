package com.n3.FunctionaPrograming;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterByAge {
    public static void TestInput() {
        String input = " 5\n"+
                "Peter, 20\n"+
                "George, 18\n"+
                "Maria, 29\n"+
                "Idan, 31\n"+
                "Simeon, 16\n"+
                "older\n"+
                "20\n"+
                "name age\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }
    public static void main(String[] args) {
        TestInput();
        Scanner s  = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());



        List<Person> people = IntStream.range(0, n)
                .mapToObj(ignored -> {
                    String[] tokens = s.nextLine().split(", ");
                    return new Person(tokens[0], Integer.parseInt(tokens[1]));
                }).collect(Collectors.toList());

        String conditionParam = s.nextLine();
        int  ageLimit = Integer.parseInt(s.nextLine());
        String[] format = s.nextLine().split("\\s+");

        Predicate<Person> filter = getFilter(conditionParam,ageLimit);
        var printer =getPrinter(format);

        people.stream()
                .filter(filter)
                .forEach(printer);

    }

    private static class Person {
        private final String name ;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    private  static Predicate<Person> getFilter (String condition,int age) {
       /* if (condition.equals("older")) {
            return p -> p.age >= age;
        }
        return p -> p.age <= age;
        */
        return condition.equals("older")
                ? p -> p.age >=age
                : p -> p.age <=age;
    }

    private static Consumer<Person> getPrinter (String[] format) {
            if (format.length == 2) {
                return p -> System.out.println(p.name + " - " + p.age);
            } else if (format[0].equals("name")) {
                return p -> System.out.println(p.name);
            } else {
                return p -> System.out.println(p.age);
            }
    }
}
