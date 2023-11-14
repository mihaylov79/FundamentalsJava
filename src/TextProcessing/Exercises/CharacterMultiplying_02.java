package TextProcessing.Exercises;

import java.util.Scanner;

public class CharacterMultiplying_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split(" ");

        char[] input1 = input[0].toCharArray();
        char[] input2 = input[1].toCharArray();
        int charSum = 0;
        int cycleLength = Math.max(input1.length, input2.length);

        for (int i = 0; i < cycleLength; i++) {

            if (i > input1.length - 1 ){
                charSum += input2[i];
            }else if (i > input2.length - 1){
                charSum += input1[i];
            }else {
                charSum += input1[i] * input2[i];
            }



        }

        System.out.println(charSum);


    }
}
