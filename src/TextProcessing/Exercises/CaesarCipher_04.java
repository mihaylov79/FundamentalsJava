package TextProcessing.Exercises;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String dataInput = kbInput.nextLine();
        char[] dataArray = dataInput.toCharArray();

        for (int i = 0; i < dataArray.length; i++) {

            dataArray[i] +=3;

        }
        String output = new String(dataArray);
        System.out.println(output);
    }
}
