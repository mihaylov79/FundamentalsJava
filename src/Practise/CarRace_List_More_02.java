package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_List_More_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer> input = Arrays.stream(kbInput.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int routeLenght = input.size() / 2;

        double leftCarSum = 0;
        double rightCarSum = 0;


        for (int i = 0; i < routeLenght; i++) {

            leftCarSum = input.get(i) == 0 ? leftCarSum * 0.8 : leftCarSum + input.get(i);

        }

        for (int j = input.size() - 1; j > routeLenght; j--) {

            rightCarSum = input.get(j) == 0 ? rightCarSum * 0.8 : rightCarSum + input.get(j);

        }

        String winner = leftCarSum < rightCarSum ? "left" : "right";

        System.out.printf("The winner is %s with total time: %.1f", winner, Math.min(leftCarSum, rightCarSum));
    }
}
