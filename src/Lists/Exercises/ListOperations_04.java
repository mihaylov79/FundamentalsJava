package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer> input = Arrays.stream(kbInput.nextLine()
                            .split(" ")).map(Integer::parseInt)
                            .collect(Collectors.toList());

        String command = kbInput.nextLine();


        while (!"end".equalsIgnoreCase(command)){

            String[] commandArray = command.split(" ");
            String commandType = commandArray[0];
            int index;


            switch (commandType){

                case "Add":
                    int AddValue = Integer.parseInt(commandArray[1]);

                    input.add(AddValue);
                    break;

                case "Insert":
                    int InsertValue = Integer.parseInt(commandArray[1]);
                    index = Integer.parseInt(commandArray[2]);

                    if (isValid(input,index)){
                        input.add(index, InsertValue);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    index = Integer.parseInt(commandArray[1]);

                    if (isValid(input, index)){
                        input.remove(index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    String direction = commandArray[1];
                    int count = Integer.parseInt(commandArray[2]);
                    if(direction.equalsIgnoreCase("left")){
                        for (int i = 0; i < count; i++) {
                            input.add(input.get(0));
                            input.remove(0);
                        }

                    }else{
                        for (int i = 0; i < count; i++) {
                            input.add(i,input.get(input.size() - 1));
                            input.remove(input.size() - 1);

                        }
                    }
                    break;
            }

            command = kbInput.nextLine();
        }

        List<String>output = input.stream()
                            .map(String::valueOf)
                            .collect(Collectors.toList());
        System.out.print(String.join(" ", output ));

    }
    public static boolean isValid(List<Integer>input, int index){
        return index >= 0 && index <= input.size()-1;

    }
}
