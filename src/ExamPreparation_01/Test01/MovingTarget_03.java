package ExamPreparation_01.Test01;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer> input = Arrays.stream(kbInput.nextLine().
                            split(" ")).map(Integer::parseInt).
                            collect(Collectors.toList());

        String commandInput = kbInput.nextLine();

        while (!"End".equalsIgnoreCase(commandInput)){

            String[] command = commandInput.split(" ");
            String commandType = command[0];
            int commandIndex = Integer.parseInt(command[1]);
            int commandValue = Integer.parseInt(command[2]);

            switch (commandType){

                case "Shoot":
                  if (isValid(commandIndex,input)){
                      input.set(commandIndex, input.get(commandIndex) - commandValue);
                      if (input.get(commandIndex) <= 0){
                          input.remove(commandIndex);

                      }
                  }
                    break;

                case "Add":
                    if (isValid(commandIndex,input)){
                        input.add(commandIndex,commandValue);
                    }else {
                        System.out.println("Invalid placement!");
                    }

                    break;

                case "Strike":
                    if (isValid(commandIndex+commandValue,input)
                                && isValid(commandIndex-commandValue,input)){
                        input.subList((commandIndex - commandValue), (commandIndex + commandValue+1)).clear();
                    }else {
                        System.out.println("Strike missed!");
                    }

                    break;
            }
            commandInput=kbInput.nextLine();

        }
        List<String>output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {

            output.add(String.valueOf(input.get(i)));
        }
        System.out.println(String.join("|",output));
    }

    public static boolean isValid(int commandIndex,List<Integer>input){

        return commandIndex >= 0 && commandIndex <= input.size()-1;

    }
}
