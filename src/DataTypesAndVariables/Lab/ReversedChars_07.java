package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        char ch1 = kbInput.nextLine().charAt(0);
        char ch2 = kbInput.nextLine().charAt(0);
        char ch3 = kbInput.nextLine().charAt(0);

        System.out.printf("%c %c %c",ch3,ch2,ch1);
    }
}
