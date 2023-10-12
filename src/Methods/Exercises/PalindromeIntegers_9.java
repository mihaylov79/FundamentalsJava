package Methods.Exercises;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PalindromeIntegers_9 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String n = kbInput.nextLine();

        while (!n.equalsIgnoreCase("end")) {

            String n1 = "";

            intCompare(n,n1);

            n = kbInput.nextLine();
        }
    }

    public static void intCompare (String n, String n1){

        for (int i = n.length() - 1; i >= 0; i--) {

            String currentChar = String.valueOf(n.charAt(i));
            n1 += currentChar;
        }
        if (n.equals(n1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
