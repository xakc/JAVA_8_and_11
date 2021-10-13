package AssociativeArrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordsSynonyms {
    public static void TestInput() {
        String input = "3\n" +
                "cute\n" +
                "adorable\n" +
                "cute\n" +
                "charming\n" +
                "smart\n" +
                "clever\n" ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        Map<String , List<String>> resMap = new LinkedHashMap<>();


        for (int i = 0; i < ; i++) {
            String key = reader.readLine();
            String value = reader.readLine();

            resMap.putIfAbsent(key,new ArrayList<>());
            resMap.get(key).add(value);

        }

        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> kvp: resMap.entrySet()) {
            String key = kvp.getKey();

            String value = String.join(", ",kvp.getValue());

            System.out.println(String.format(pattern, kvp.getKey(), kvp.getValue()));
        }

    }


}
