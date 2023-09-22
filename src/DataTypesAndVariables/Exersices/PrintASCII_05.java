package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class PrintASCII_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int startChar = Integer.parseInt(kbInput.nextLine());
        int endChar = Integer.parseInt(kbInput.nextLine());

        for (int i = startChar; i <= endChar ; i++) {

            char symbol = (char) i;

            System.out.print(symbol + " ");

        }
    }
}
