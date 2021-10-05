package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Kamino_Factory {
    public static void TestInput() {
        String input = "5\n" +
                "1!0!1!1!0\n" +
                "0!1!1!0!0\n" +
                "Clone them!\n"
              ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());
        String input = "";
        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestSequenceIndexRow = 0;
        int bestSequenceIndexRowOutput = 0;
        String bestSequenceOutput ="";
        while (!"Clone them".equals(input = reader.readLine())){

            ++bestSequenceIndexRow;
            String[] data =  Arrays.stream(input.split("[!]"))
                                            .filter(e->!e.equals(""))
                                            .toArray(String[]::new);
            int[] sequenceDNA = new int[size];

            int index = 0;
            for (int i = 0; i < data.length; i++) {
                sequenceDNA[index]= Integer.parseInt(data[i]);
                index++;
            }

            int maxCount = 0;
            int sequenceIndex = 0;
            for (int i = 0; i < sequenceDNA.length ; i++) {
                int currentCount = 0;

                for (int j = i; j < sequenceDNA.length; j++) {
                        if (sequenceDNA[i]== sequenceDNA[j]){
                            currentCount++;
                            if (currentCount>maxCount) {
                                maxCount=currentCount;
                                sequenceIndex = i;
                            }
                        } else {
                            break;
                        }
                }
            }
            
            int sequenceSum = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                  if (sequenceDNA[i]==1){
                      sequenceSum+=sequenceDNA[i];
                  }
            }
            if (sequenceIndex<bestSequenceIndex || sequenceSum>bestSequenceSum){
                bestSequenceOutput="";
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum =sequenceSum;
                bestSequenceIndexRowOutput = bestSequenceIndexRow;

                for (int i = 0; i < sequenceDNA.length; i++) {
                    bestSequenceOutput +=sequenceDNA[i]+" ";
                }
            }
        }
        int[] inputData = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(e-> Integer.parseInt(e)).toArray();


    }
}
