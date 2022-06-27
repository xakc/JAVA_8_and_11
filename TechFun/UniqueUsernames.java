package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {

    public static void TestInput() {
        String input = "6\n"+
                "Hello\n"+
                "Hello\n"+
                "Hello\n"+
                "Greetings\n"+
                "World\n"+
                "Hello\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            String username = s.nextLine();
            usernames.add(username);
        }

        usernames.forEach(System.out::println);


    }

}
