package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] firstArray = kbInput.nextLine().split(" ");
        String[] secondArray = kbInput.nextLine().split(" ");

        for (String secondElement: secondArray) {
            for (String firstElement: firstArray) {
                if (secondElement.equals(firstElement)){
                    System.out.print(secondElement + " ");
                }

            }

        }
    }
}
