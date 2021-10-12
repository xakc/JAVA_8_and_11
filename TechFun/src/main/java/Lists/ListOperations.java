package Lists;
import sun.jvm.hotspot.debugger.linux.LinuxDebugger;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {

    public static void TestInput() {
        String input = "1 2 3 4 5 5 5 6\n" +
                "Delete 5\n" +
                "Insert 10 1\n" +
                "Delete 5\n" +
                "end\n";
        System.setIn( new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {

        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> data = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        String[] commands = reader.readLine().split("\\s+");

        while (!commands[0].equals("end")) {
            switch (commands[0]){

                case "Add":
                    int number = Integer.parseInt(commands[1]);

                    data = data.stream()
                            .filter((e->!e.equals(number)))
                            .collect(Collectors.toList());
                    break;

                case "Insert":
                    String element = commands[1];
                    int position = Integer.parseInt(commands[2]);

                    if (position>=0 && position < data.size()){
                        data.add(position,element);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case "Remove":
                     int indexToRemove  = Integer.parseInt(commands[1]);
                    if (indexToRemove>=0 && indexToRemove < data.size()){
                       data.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                        int count = Integer.parseInt(commands[2]);

                        if (commands[1].equals("left")){
                            for (int i = 0; i < count % data.size(); i++) {

                            }
                        }

                    break;


            }


            commands = reader.readLine().split("\\s+");
        }

        System.out.println(data.toString().replaceAll("\\[|,|\\]",""));

    }

}
