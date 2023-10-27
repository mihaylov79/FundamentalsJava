package ObjectAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split(" ");

        Random randomNum = new Random();

        for (int i1 = 0; i1 < input.length; i1++) {

            int randomWord = randomNum.nextInt(input.length);
           input[i1] = input[randomWord];

        }

        System.out.println(String.join(System.lineSeparator(),input));
    }
}
