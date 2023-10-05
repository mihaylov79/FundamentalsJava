package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequences_07 {
    public static void main(String[] args) {


    Scanner kbInput = new Scanner(System.in);

    int[] numbersInput = Arrays.stream(kbInput.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt).toArray();



        int sequenceDigit ;
        int maxSequenceCount = 0;
        int maxSequenceDigit = 0;



        for (int i = 0; i < numbersInput.length; i++) {

            int sequenceCount = 1;

            for (int j = i+1; j < numbersInput.length ; j++) {

                if (numbersInput[i] == numbersInput[j]) {

                        sequenceCount++;
                        sequenceDigit = numbersInput[i];

                }else {
                    break;
                }

                if (sequenceCount > maxSequenceCount) {
                    maxSequenceCount = sequenceCount;
                    maxSequenceDigit = sequenceDigit;
                }

            }
        }
        for (int i = 0; i < maxSequenceCount; i++) {
            System.out.print(maxSequenceDigit + " ");

        }



    }
}
