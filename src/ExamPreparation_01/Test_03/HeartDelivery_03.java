package ExamPreparation_01.Test_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Integer>neighbourhood = Arrays.stream(kbInput.nextLine()
                                    .split("@")).map(Integer::parseInt)
                                    .collect(Collectors.toList());

        String[] command = kbInput.nextLine().split(" ");
        int cupidPos = 0;

        while (!"Love!".equalsIgnoreCase(command[0])){

            int jump  = Integer.parseInt(command[1]);

            cupidPos += jump;
            if (cupidPos > neighbourhood.size() - 1){
                cupidPos = 0;
                if (isValentine(neighbourhood,cupidPos)){
                    printIsAlreadyValentine(cupidPos);
                }else {
                    neighbourhood.set(cupidPos, neighbourhood.get(cupidPos)-2);

                    if (isValentine(neighbourhood,cupidPos)){
                        printIsValentive(cupidPos);
                    }
                }


            } else if (isValentine(neighbourhood,cupidPos)) {

                printIsAlreadyValentine(cupidPos);

            }else {
                neighbourhood.set(cupidPos, neighbourhood.get(cupidPos)-2);

                if (isValentine(neighbourhood,cupidPos)){
                    printIsValentive(cupidPos);
                }
            }

            command = kbInput.nextLine().split(" ");



        }

        System.out.printf("Cupid's last position was %d.%n",cupidPos);

        int successCount = 0;
        for (int i = 0; i < neighbourhood.size(); i++) {
            if (neighbourhood.get(i) <= 0){
                successCount++;
        }

        }
        if (successCount >= 0 && successCount < neighbourhood.size()){
            System.out.printf("Cupid has failed %d places.%n",neighbourhood.size() - successCount);

        }else {
            System.out.println("Mission was successful.");
        }


    }

    public static boolean isValentine(List<Integer>neigbourhood, int cupidPos){

        return  neigbourhood.get(cupidPos)==0;
    }


    public static void printIsValentive(int cupidPos){

        System.out.printf("Place %d has Valentine's day.%n",cupidPos);
    }

    public static void printIsAlreadyValentine(int cupidPos){

        System.out.printf("Place %d already had Valentine's day.%n",cupidPos);
    }
}
