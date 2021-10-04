import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Most_frequent_words_in_array {
    public static void TestInput() {
        String input = "Milka Milka Milka Milka Thor Batman Flash Batman\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = reader.readLine().split("\\s+");

        // Insert all unique strings and update count if a string is not unique.
        Map<String,Integer> hshmap = new HashMap<String, Integer>();

        for (String str : array)
        {
            if (hshmap.keySet().contains(str)) // if already exists then update count.
                hshmap.put(str, hshmap.get(str) + 1);
            else
                hshmap.put(str, 1); // else insert it in the map.
        }
        // Traverse the map for the maximum value.
        String maxStr = "";
        int maxVal = 0;

        for (Map.Entry<String,Integer> entry : hshmap.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();

            if (count > maxVal)
            {
                maxVal = count;
                maxStr = key;
            }

            // Condition for the tie.
            else if (count == maxVal){
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }
        System.out.println("Most frequent word: "+ maxStr);
        System.out.println("Count: "+ maxVal);
    }
}
