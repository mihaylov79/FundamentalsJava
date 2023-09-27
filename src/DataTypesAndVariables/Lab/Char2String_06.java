package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Char2String_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            char character = kbInput.nextLine().charAt(0);


            text.append(character);

        }
        System.out.print(text);
    }
}
