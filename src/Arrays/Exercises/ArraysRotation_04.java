package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRotation_04 {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int[]  array = Arrays.stream(kbInput.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int cycles = Integer.parseInt(kbInput.nextLine());


        for (int i = 0; i < cycles; i++) {
            int firstNum = array[0];
            for (int j = 0; j < array.length - 1 ; j++) {


                    array[j] = array[(j + 1)];

            }
            array[array.length - 1] = firstNum;

        }

        for (int numz: array) {
            System.out.print(numz + " ");
        }
    }
}
