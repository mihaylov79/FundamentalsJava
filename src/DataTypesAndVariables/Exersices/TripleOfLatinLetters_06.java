package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class TripleOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner kbInput  = new Scanner(System.in);

        int n = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < n ; i++) {
            char firschar = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondchar = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char thirdchar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n",firschar,secondchar,thirdchar);

                }

            }

        }
    }
}
