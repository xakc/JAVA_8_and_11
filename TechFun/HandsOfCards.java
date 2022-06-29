package com.n3.Sets;

import java.io.ByteArrayInputStream;
import java.util.*;

public class HandsOfCards {public static void TestInput() {
    String input = "Peter: 2C, 4H, 9H, AS, QS\n"+
            "Slav: 3H, 10S, JC, KD, 5S, 10S\n"+
            "Alex: QH, QC, QS, QD\n"+
            "Slav: 6H, 7S, KC, KD, 5S, 10C\n"+
            "Peter: JD, JD, JD, JD, JD, JD\n"+
            "JOKER\n"
            ;
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
    TestInput();
        Scanner s = new Scanner(System.in);
        LinkedHashMap<String, Set<String>> playersCards = new LinkedHashMap<>();

        String input = s.nextLine();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String cardsStr = input.split(": ")[1];
            String[] cardsArr = cardsStr.split(", ");
            Set<String> cars = new HashSet<>();
            Collections.addAll(cars,cardsArr);

            if (playersCards.containsKey(name)){
                Set<String> currentCards = playersCards.get(name);
                currentCards.addAll(cars);
                playersCards.put(name,currentCards);
            }else {
                playersCards.put(name,cars);
            }
            input=s.nextLine();
        }

        playersCards.entrySet().forEach( entry -> {
                    String name = entry.getKey();
                    int points = getCardsPoints(entry.getValue());
                });
    }

    private static int getCardsPoints(Set<String> cards) {
        Map<Character,Integer> pointsMap = getPartOFCardValue();
        int sumCards = 0;
        for (String card :cards) {
            int points = 0;
            if (card.contains("10")){
                char type = card.charAt(2);
                points = 10*pointsMap.get(type);
            } else {
                char number = card.charAt(0);
                char type = card.charAt(1);
                points = pointsMap.get(number)*pointsMap.get(type);
            }
            sumCards+=points;
        }
        return sumCards;
    }

    private static  Map <Character,Integer> getPartOFCardValue() {
        Map<Character,Integer> points = new HashMap<>();
        points.put('2',2);
        points.put('3',3);
        points.put('4',4);
        points.put('5',5);
        points.put('6',6);
        points.put('7',7);
        points.put('8',8);
        points.put('9',9);
        points.put('J',11);
        points.put('Q',12);
        points.put('K',13);
        points.put('A',14);
        points.put('S',4);
        points.put('H',3);
        points.put('D',2);
        points.put('C',1);
    return points;
    }
}
