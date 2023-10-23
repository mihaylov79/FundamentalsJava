package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer>wagons = Arrays.stream(kbInput.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(kbInput.nextLine());

        String command = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(command)){

            if (command.contains("Add")){
                String[]commadArray = command.split(" ");
                int commandValue = Integer.parseInt(commadArray[1]);

                wagons.add(commandValue);

            }else {
                int passagers = Integer.parseInt(command);

                for (int i = 0; i < wagons.size(); i++) {
                    if (passagers <= wagonCapacity - wagons.get(i)){
                        wagons.set(i, passagers + wagons.get(i));
                        //passagers -= wagonCapacity - wagons.get(i);
                        break;
                    }

                }
            }

            command = kbInput.nextLine();

        }

        List<String>output = wagons.stream()
                            .map(String::valueOf).
                            collect(Collectors.toList());

        System.out.print(String.join(" ", output));
    }
}
