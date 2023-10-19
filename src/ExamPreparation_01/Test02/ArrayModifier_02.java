package ExamPreparation_01.Test02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int[] arrayInput = Arrays.stream(kbInput.nextLine()
                            .split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command  = kbInput.nextLine().split(" ");

        while (!"end".equalsIgnoreCase(command[0])){

          String commandType = command[0];

           switch (commandType){
             case "swap":
                 int index1 = Integer.parseInt(command[1]);
                 int index2 = Integer.parseInt(command[2]);
                 int container = arrayInput[index2];
                 arrayInput[index2] = arrayInput[index1];
                 arrayInput[index1] = container;

                 break;

             case "multiply":
                 index1 = Integer.parseInt(command[1]);
                 index2 = Integer.parseInt(command[2]);

                 arrayInput[index1] *= arrayInput[index2];

                 break;

             case "decrease":
                 for (int i = 0; i < arrayInput.length; i++) {

                     arrayInput[i] -= 1;

                 }

                break;
           }

            command = kbInput.nextLine().split(" ");

        }


        String[] arrayOutput = (Arrays.stream(arrayInput).mapToObj(String::valueOf).toArray(String[]::new));


//        for (int i = 0; i < arrayInput.length; i++) {
//            arrayOutput[i] = String.valueOf(arrayInput[i]);
//        }

        System.out.print(String.join(", ",arrayOutput));

    }


}
