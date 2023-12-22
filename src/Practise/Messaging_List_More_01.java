package Practise;

import java.util.*;
import java.util.stream.Collectors;

public class Messaging_List_More_01 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        List<String> digitsInput = Arrays.stream(kbInput.nextLine().split(" ")).
                collect(Collectors.toList());

        StringBuilder textInput = new StringBuilder(kbInput.nextLine());
        StringBuilder output = new StringBuilder();


        for (int i = 0; i < digitsInput.size(); i++) {
            int sum = 0;

            char[] currentValueSum = digitsInput.get(i).toCharArray();
            for (int j = 0; j < currentValueSum.length; j++) {

                sum += Integer.parseInt(String.valueOf(currentValueSum[j]));
            }
            String currentLetter;
            if (sum >= textInput.length()) {

                sum -= textInput.length();
                currentLetter = String.valueOf(textInput.charAt(sum));
                output.append(currentLetter);
                textInput.replace(sum, sum + 1, "");
            } else {
                currentLetter = String.valueOf(textInput.charAt(sum));

                output.append(currentLetter);

                textInput.replace(sum, sum + 1, "");
            }


        }

        System.out.println(output);
    }
}
