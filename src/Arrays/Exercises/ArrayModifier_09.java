package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int[] arrayInput = Arrays.stream(kbInput.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt).toArray();

        String command = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(command)) {

           if (command.contains("swap")){
               String[] swap = command.split(" ");
               int index1 = Integer.parseInt(swap[1]);
               int index2 = Integer.parseInt(swap[2]);

               int container = arrayInput[index1];
               arrayInput[index1] = arrayInput[index2];
               arrayInput[index2] = container;

           }

           if (command.contains("multiply")) {
               String[] multiply = command.split(" ");
               int index1 = Integer.parseInt(multiply[1]);
               int index2 = Integer.parseInt(multiply[2]);

               int container = arrayInput[index1] * arrayInput[index2];
               arrayInput[index1] = container;

           }
           if (command.contains("decrease")){
               for (int i = 0; i < arrayInput.length; i++) {
                   arrayInput[i] -= 1;
               }

           }

            if (!"end".equalsIgnoreCase(command)){
                command = kbInput.nextLine();
            }

        }

        String[] arr = Arrays.stream(arrayInput)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new);

        System.out.print(Arrays.toString(arr).replaceAll("[\\[\\]]",""));


    }
}
