package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class DecryptingMessages_05_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int key = Integer.parseInt(kbInput.nextLine());
        int lines = Integer.parseInt(kbInput.nextLine());

        //char letters = kbInput.nextLine().charAt(0);
        StringBuilder decripted = new StringBuilder();
        int ascii ;

        for (int i = 0; i < lines; i++) {

            char letters = kbInput.nextLine().charAt(0);
            ascii = (int)letters +key;
            char decripting = (char) ascii;
            decripted.append(decripting);

        }
        System.out.println(decripted);
    }

}
