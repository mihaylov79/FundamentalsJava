package ExamPreparation_01.Test02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {


      Scanner kbInput = new Scanner(System.in);

      int[] input = new int[4];

      for (int i = 0; i < input.length; i++) {

            input[i] = Integer.parseInt(kbInput.nextLine());

      }

       int efficiencyPerHor = input[0] + input[1] + input[2];

       int studentsQ = input[3];
       int hourCount = 0;


        while (studentsQ > 0){
           studentsQ -= efficiencyPerHor;
           hourCount ++;

            if (hourCount % 4 == 0){
                hourCount ++;
            }

        }

        System.out.printf("Time needed: %dh.",hourCount);

    }

}
