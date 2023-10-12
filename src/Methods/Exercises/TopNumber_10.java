package Methods.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int input = Integer.parseInt(kbInput.nextLine());

        for (int i = 1; i <= input ; i++) {

            int sum =0;
            boolean isValid = false;

            List<Integer> number = numberDecomposition(i);

            for (int j = 0; j < number.size(); j++) {
                if ((number.get(j) / 2) != 0){
                    isValid = true;
                }
                sum += number.get(j);
            }
            if (sum % 8 == 0 && isValid){
                for (int digit: number) {
                    System.out.print(digit);

                }
                System.out.println();
                number.clear();
            }

        }




    }

    public static List<Integer> numberDecomposition (int i){

        List<Integer> number = new ArrayList<>();
        while (i > 0){
            int currentDigit = i % 10;
            number.add(currentDigit);
            i /= 10;
        }
        Collections.reverse(number);
        return number;
    }
}
