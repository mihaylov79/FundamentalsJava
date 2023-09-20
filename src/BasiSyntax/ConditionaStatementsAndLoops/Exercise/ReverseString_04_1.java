package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class ReverseString_04_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String reversed = "";

        for (int i = 1; i <= word.length() ; i++) {
            char letter = word.charAt(word.length() - i);
            reversed += letter;

        }
        System.out.println(reversed);
    }
}
