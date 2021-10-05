package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Top_Integers {

    public static void TestInput() {
        String input = "14 24 3 19 15 17\n"
              ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {

        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputData = Arrays.stream(reader.readLine().
                                        split("\\s+")).
                                        mapToInt(e-> Integer.parseInt(e)).
                                        toArray();


        for (int i = 0; i < inputData.length; i++) {
            boolean isGreater = true;

            for (int j = i+1; j < inputData.length; j++) {
                if (inputData[i]<inputData[j]){
                    isGreater = false;
                    break;
                }
            }
            if (isGreater){
                System.out.println(inputData[i]);
            }
        }
    }
}
