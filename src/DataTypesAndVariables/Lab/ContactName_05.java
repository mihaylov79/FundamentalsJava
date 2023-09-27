package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ContactName_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String name = kbInput.nextLine();
        String family = kbInput.nextLine();
        String delimiter = kbInput.nextLine();

        System.out.printf("%s%s%s",name,delimiter,family);
    }
}
