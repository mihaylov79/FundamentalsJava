package TextProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String dataInput = kbInput.nextLine();

        char[] charArray = dataInput.toCharArray();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {

            output.append(charArray[i]);


            if (isValid(charArray,i) && charArray[i] == charArray[i+1]){


                while (isValid(charArray,i) && charArray[i] == charArray[i + 1]){


                    i++;

                }
            }
        }

        System.out.println(output);
    }


    public static boolean isValid(char[] charArray, int i){
        return  i < (charArray.length -1);
    }
}
