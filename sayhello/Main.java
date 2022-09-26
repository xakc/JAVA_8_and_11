package com.n3.sayhello;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Arnaud"));
        persons.add(new Macedonian("Alexander"));

        for (Person person : persons) {
            System.out.println(person.getHello());
        }




    }
}
