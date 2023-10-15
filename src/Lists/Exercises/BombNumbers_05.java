package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(kbInput.nextLine()
                            .split(" ")).map(Integer::parseInt)
                            .collect(Collectors.toList());

        String bomb = kbInput.nextLine();

        int bombNum = Integer.parseInt(String.valueOf(bomb.charAt(0)));
        int bombPower = Integer.parseInt(String.valueOf(bomb.charAt(2)));

        while (numbers.contains(bombNum)){
            int bombIndex = numbers.indexOf(bombNum);
            int indexLow = bombIndex - bombPower;
            if (indexLow < 0){
                int diff = -indexLow;
                indexLow +=diff;
            }
            int indexHigh = bombIndex + bombPower;
            if(indexHigh > numbers.size() -1){
                indexHigh = numbers.size() - 1;

            }
            int explode = (indexHigh - indexLow) ;




            if (explode > numbers.size() - 1){
                explode = numbers.size() - 1;
            }

            for (int i = 0; i <= explode; i++) {
                numbers.remove(indexLow);
            }

        }
        int sum = 0;
        for (int elements: numbers) {

            sum +=elements;
        }
        System.out.println(sum);
    }
}
