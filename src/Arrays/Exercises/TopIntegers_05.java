package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner kbInput  = new Scanner(System.in);

        int[] array = Arrays.stream(kbInput.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int i = 0; i < array.length; i++) {
            boolean top = true;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] <= array[j]) {
                    top = false;
                    break;
                }

            }
            if (top) {
                System.out.print(array[i] + " ");
            }

        }
    }
}
