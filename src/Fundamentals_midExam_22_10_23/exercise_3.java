package Fundamentals_midExam_22_10_23;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercise_3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        List<Integer>priceRating = Arrays.stream(scan.nextLine()
                .split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int entryIndex = Integer.parseInt(scan.nextLine());
        String itemsType = scan.nextLine();
        int rightSum = 0;
        int leftSum = 0;

        for (int i = entryIndex+1; i < priceRating.size() ; i++) {

            if ("cheap".equalsIgnoreCase(itemsType)){
                if (priceRating.get(entryIndex) > priceRating.get(i)){
                    rightSum += priceRating.get(i);
                }
            }else {
                if (priceRating.get(entryIndex) <= priceRating.get(i)){
                    rightSum += priceRating.get(i);
                }
            }

        }
        for (int i = entryIndex - 1; i >=0 ; i--) {

            if ("cheap".equalsIgnoreCase(itemsType)){
                if (priceRating.get(entryIndex) > priceRating.get(i)){
                    leftSum += priceRating.get(i);
                }

            }else {
                if (priceRating.get(entryIndex) < priceRating.get(i)){
                    leftSum += priceRating.get(i);
                }
            }

        }

        if (leftSum >= rightSum){
            String position = "Left";
            System.out.printf("%s - %d%n",position,leftSum);
        }else {
            String position = "Right";
            System.out.printf("%s - %d%n",position,rightSum);
        }






    }
}
