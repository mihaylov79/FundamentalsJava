package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        List<Double> numbers = Arrays.stream(input.split(" ")).map(Double::parseDouble).toList();


        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))){

                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i--;
            }

        }
        for (double index: numbers) {
            System.out.println(new DecimalFormat("0.#").format(index) + " ");
        }
    }
}
