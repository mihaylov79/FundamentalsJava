package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer>input = Arrays.stream(kbInput.nextLine()
                            .split(" ")).map(Integer::parseInt)
                            .collect(Collectors.toList());

        String command = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(command)){
            String[] commandArray = command.split(" ");
            String commandType = commandArray[0];
            int commandElement = Integer.parseInt(commandArray[1]);

            switch (commandType){
                case "Delete":

                    for (int i = 0; i < input.size(); i++) {

                        if (input.get(i) == commandElement){
                            input.remove(i);
                            i--;
                        }

                    }
                    break;
                case "Insert":
                    int position = Integer.parseInt(commandArray[2]);

                    input.add(position, commandElement);
                    break;
            }
            command = kbInput.nextLine();
        }

        for (int elemets: input) {
            System.out.print(elemets + " ");
        }
    }
}
