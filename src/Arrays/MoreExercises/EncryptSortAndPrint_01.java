package Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrint_01 {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int inputNumbers = Integer.parseInt(kbInput.nextLine());

        int[] output = new int[inputNumbers];

        for (int i = 0; i < inputNumbers; i++) {

            String stringInput = kbInput.nextLine();
            int sum = 0;

            for (int j = 0; j < stringInput.length(); j++) {

                char[] input = stringInput.toCharArray();

                if (input[j] == 'a' || input[j] == 'o' || input[j] == 'u' || input[j] == 'e' || input[j] == 'i'
                        || input[j] == 'A' || input[j] == 'O' || input[j] == 'U' || input[j] == 'E' || input[j] == 'I' ){

                    sum +=  input[j] * stringInput.length();

                }else {
                    sum += input[j] / stringInput.length();
                }

            }

            output[i] = sum;

        }
        Arrays.sort(output);
        for (int index: output) {
            System.out.println(index);
        }
    }
}
