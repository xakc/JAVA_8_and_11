package AssociativeArrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {

    public static void TestInput() {
        String input = "8 2 2 8 2\n" ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] nums = Arrays
                            .stream(reader.readLine().split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();

        Map<Double,Integer> result = new TreeMap<>();

        for (double num : nums) {
            if (!result.containsKey(num)){
                result.put(num,0);
            }
            int previousValue = result.get(num);
            result.put(num,previousValue+1);
        }

        for (Map.Entry<Double,Integer> kvp: result.entrySet()) {
            System.out.println(kvp.getKey()+ " -> "+ kvp.getValue());
        };
    }


}
