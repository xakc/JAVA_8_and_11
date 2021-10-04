package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZigZag_Arrays {
    public static void TestInput() {
        String input = "4\n" +
                "1 5\n" +
                "9 10\n" +
                "31 81\n" +
                "41 20\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }
    public static void main(String[] args) throws IOException {
        TestInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(reader.readLine());
        int[] nums1 = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] nums2 = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();


    }
}
