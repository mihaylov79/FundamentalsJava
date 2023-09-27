package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars_rev02_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        char input ;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            input = kbInput.nextLine().charAt(0);

            output.append(input).append(" ");
        }
        output.reverse();

        System.out.println(output);
    }
}
