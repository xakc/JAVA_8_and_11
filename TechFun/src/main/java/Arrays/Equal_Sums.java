package Arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Equal_Sums {

    public static void TestInput() {
        String input = "1 2 3 3\n"
                ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {

        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(e->Integer.parseInt(e)).toArray();

        for (int i = 0; i < nums.length ; i++) {
            int leftSum = 0;

            for (int k = 0; k < i; k++) {
                int currNum = nums[k];
                leftSum+= currNum;
            }

            int rightSum = 0;
            for (int j = i+1; j < nums.length; j++) {
                int currNum = nums[j];
                rightSum+=currNum;
            }

            if (leftSum==rightSum){
                System.out.println("The index that splits the array in equal sums is : "+i);
                return;
            }
        }


            System.out.println("There is no part in the array which splits the array in equal sums");


    }
}
