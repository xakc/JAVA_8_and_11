package Lists;

import com.apple.laf.AquaInternalFrameDockIconUI;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {

    public static void TestInput() {
        String input = "3 3 6 1\n" ;
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] inputData = reader.readLine().split("\\s+");

        List<Double> doulbeList = new ArrayList<>();
        for (int i = 0; i < inputData.length ; i++) {
            doulbeList.add(Double.parseDouble(inputData[i]));
        }

        for (int i = 0; i < doulbeList.size()-1; i++) {
            double firstNum = doulbeList.get(i);
            double secondNum = doulbeList.get(i+1);

            if (firstNum == secondNum) {
                double sum = firstNum + secondNum;

                doulbeList.set(i,sum);
                doulbeList.remove(i+1);
                i = -1;
            }
        }
        System.out.println(concatListElements(doulbeList));
    }

    static String concatListElements(List<Double> list){
        String resultToPrint ="";

        DecimalFormat format = new DecimalFormat("#.##");

        for (int i = 0; i < list.size() ; i++) {


            if (i == list.size()-1){
                resultToPrint+= format.format(list.get(i));
            } else {
                resultToPrint +=format.format(list.get(i))+" ";
            }
        }

        return resultToPrint.trim();
    }

}
