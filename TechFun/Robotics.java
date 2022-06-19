package com.n3;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {

    public static void TestInput() {
        String input = "ROB-15;SS2-10;NX8000-3\n"+
                        "8:00:00\n"+
                        "detail\n"+
                        "glass\n"+
                        "wood\n"+
                        "apple\n"+
                        "End\n"
                ;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        TestInput();
        Scanner s = new Scanner(System.in);

        String[] inputRobots = s.nextLine().split(";");
        Map<String,Integer> robots = splitRobotsDataIntoLinkedMap(inputRobots);
        int[] processTimes = new int[robots.size()];
        String[] time = s.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        long totalSeconds = hours*3600 + minutes*60 + seconds;

        ArrayDeque<String> products = new ArrayDeque<>();

        String line = s.nextLine();

        while (!line.equals("End")) {
            products.add(line);
            line = s.nextLine();
        }

        while (!products.isEmpty()){
            totalSeconds++;

            String current = products.poll();

            decreaseProcessTime(processTimes);

            if (!assignJob(robots, processTimes, current, totalSeconds)) {
                products.offer(current);
            }


        }

        System.out.println("The End");
    }

    private static void decreaseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length ; i++) {
            if (processTimes[i]>0) {
                --processTimes[i];
            }
        }
    }

    private static boolean assignJob(Map<String, Integer> robots, int[] processTimes, String current, long totalSeconds) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i]==0) {
                int count = 0;

                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count==i){
                       processTimes[i]=entry.getValue();
                        logJobAssigned(entry.getKey(),current,totalSeconds);
                        return  true;
                    }
                    count++;
                }
            }
        }

        return false;
    }

    private static void logJobAssigned(String name, String product, long totalSeconds) {
        long hours = totalSeconds/ 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.println(String.format("%s - %s [%02d:%02d:%02d] ",name,product,hours, minutes, seconds));
    }

    private static Map<String, Integer> splitRobotsDataIntoLinkedMap(String[] inputRobots) {
        Map<String , Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf("-");

            String name = line.substring(0,index);
            int time = Integer.parseInt(line.substring(index+1));

            robots.put(name,time);
        }

        return robots;

    }

}
