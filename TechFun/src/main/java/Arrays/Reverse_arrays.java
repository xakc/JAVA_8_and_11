package Arrays;

import java.io.ByteArrayInputStream;
import java.util.*;

public class Reverse_arrays {

    public static void main(String[] args) {
//        TestInput();

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length/2; i++) {
            String temp = words[i];
            words[i] = words[words.length-1 - i];
            words[words.length-1 - i] = temp;
        }

        System.out.println(String.join(" ",words));
    }
}
