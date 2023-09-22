package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner kbinput = new Scanner(System.in);

        int letterCount = Integer.parseInt(kbinput.nextLine());
        int sum = 0;

        for (int i = 0; i < letterCount; i++) {
            char letter = kbinput.nextLine().charAt(0);
            //int intLetter = letter;
            sum += letter;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
