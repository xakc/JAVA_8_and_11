package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.security.Key;
import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {

    public static void TestInput() {
        String input = "John\n"+
                "johnDoe@test.email\n"+
                "Isus Hristovski\n"+
                "jeasus.christ@holly.church\n"+
                "Love People\n"+
                "love@people.info\n"+
                "stop\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        LinkedHashMap<String,String> emailsData = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String name = input;
            String email = s.nextLine();

            if (!email.endsWith("us")
                    && !email.endsWith("uk")
                    && !email.endsWith("com")
                ) {
                emailsData.put(name,email);
            }

            input = s.nextLine();
        }

      emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
