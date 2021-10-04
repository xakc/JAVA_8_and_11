package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SummingOdd_and_Even_nums {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] str = Arrays.stream(s.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
        

    }
}
