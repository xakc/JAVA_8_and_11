package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTableElements {
    public static void TestInput() {
        String input = "4\n"+
                "Ce O\n"+
                "Mo O Ce\n"+
                "Ee\n"+
                "Mo\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        int counter = Integer.parseInt(s.nextLine());
        TreeSet<String > elements = new TreeSet<>();

        for (int i = 0; i < counter; i++) {
            String[] inputElemens = s.nextLine().split("\\s+");
//            for ( String element: inputElemens) {
//                elements.add(element);
//            }
            Collections.addAll(elements,inputElemens);
        }

        elements.forEach(e-> System.out.print(e+ " "));

    }


}
