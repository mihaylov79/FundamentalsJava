package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LoweOrUpperCase_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        char letter = kbInput.nextLine().charAt(0);

        if (Character.isUpperCase(letter)){
            System.out.println("upper-case");
        } else if (Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        }else {
            System.out.println("Unkown");
        }
    }
}
