package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Common_Elements {
    public static void TestInput() {
        String input = "Hey hello 2 4\n" +
                "10 hey 4 hello\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = reader.readLine().split("\\s+");
        String[] arr2 = reader.readLine().split("\\s+");



        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])){
                    System.out.print(arr1[i]+" ");
                }
            }
        }



    }
}
