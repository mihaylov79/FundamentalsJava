package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int[] arrayInput = Arrays.stream(kbInput.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt).toArray();

        int givenNumber = Integer.parseInt(kbInput.nextLine());


        for (int i = 0; i < arrayInput.length; i++) {

            for (int j = i + 1; j < arrayInput.length ; j++) {

                if (arrayInput[i] + arrayInput[j] == givenNumber){
                    System.out.println(arrayInput[i] + " " + arrayInput[j]);
                }

            }

        }
    }
}
