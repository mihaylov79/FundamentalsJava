package Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        char firstChar = kbInput.nextLine().charAt(0);
        char secondChar = kbInput.nextLine().charAt(0);

        printChars(firstChar,secondChar);
    }

    public static void printChars (char firstChar, char secondChar){

        if (firstChar < secondChar){
            for (int i = firstChar +1; i < secondChar ; i++) {
                System.out.print((char) i + " ");

            }
        }else {
            for (int i = secondChar +1; i < firstChar ; i++) {
                System.out.print((char) i + " ");

            }
        }



    }
}
