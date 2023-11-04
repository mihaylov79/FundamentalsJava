package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();
        LinkedHashMap<Character, Integer> words = new LinkedHashMap<>();



        for (int i = 0; i < input.length() ; i++) {

            char inputChar = input.charAt(i);

            if (!(inputChar == ' ')){

                if (words.containsKey(inputChar)){
                    words.put(inputChar, words.get(inputChar)+1);
                }else {
                    words.put(inputChar, 1);
                }
            }

        }
        for (Map.Entry<Character,Integer>entry: words.entrySet()) {

            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());

        }
    }
}
