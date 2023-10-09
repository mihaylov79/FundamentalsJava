package Methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split("");

        findVowels(input);
    }
    public static void findVowels (String[] input){

        int vowelCounter = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i].equalsIgnoreCase("a")
                    || input[i].equalsIgnoreCase("o")
                    || input[i].equalsIgnoreCase("e")
                    || input[i].equalsIgnoreCase("u")
                    || input[i].equalsIgnoreCase("i") ){
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);
    }
}
