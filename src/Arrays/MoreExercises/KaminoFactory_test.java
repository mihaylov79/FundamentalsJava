package Arrays.MoreExercises;

import java.util.Scanner;
import java.util.Arrays;

public class KaminoFactory_test {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int dnaNumbers = Integer.parseInt(kbInput.nextLine());

        int[] output = new int[dnaNumbers];
        int  firstIndex = 0;
        int bestSampleSum = 0;
        int bestSampleRow = 0;
        int bestFullSum = 0;
        int row = 0;
        boolean printBestFullSum = false;

        String command = kbInput.nextLine();

        while (!"Clone them!".equalsIgnoreCase(command)){

            int[] dnaSample = Arrays.stream(command.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();

            int sum = 0;
            boolean isFound = false;
            int index = 0;
            int fullSum = 0;


            row ++;

            for (int i = 0; i < dnaSample.length; i++) {

                fullSum += dnaSample[i];

                if (i == 0 && dnaSample[i] == 1 && dnaSample[i + 1] == 1  ){

                    sum +=  dnaSample[i];

                    if (!isFound){
                        index = i;

                        isFound = true;
                    }
                }

                if ((i == dnaSample.length - 1) && dnaSample[i] == 1 && dnaSample[i - 1] == 1  ){

                    sum +=  dnaSample[i];

                    if (!isFound){
                        index = i;

                        isFound = true;
                    }
                }


                if (i > 0 && (i < dnaSample.length - 1)){

                    if ((dnaSample[i] == 1 && dnaSample[i + 1] == 1) || (dnaSample[i] == 1 && dnaSample[i - 1] == 1)){

                        sum +=  dnaSample[i];

                        if (!isFound){
                            index = i;

                            isFound = true;
                        }

                    }

                }


            }


            if (sum > bestSampleSum){

                bestFullSum = fullSum;

                firstIndex = index;

                bestSampleSum = sum;

                bestSampleRow = row;

                printBestFullSum = false;

                for (int j = 0; j < output.length; j++) {

                    output[j] = dnaSample[j];

                }

            }else if (sum == bestSampleSum){
                if (index < firstIndex){
                    firstIndex = index;

                    //bestSampleSum = sum;

                    bestSampleRow = row;

                    for (int j = 0; j < output.length; j++) {

                        output[j] = dnaSample[j];

                    }
                } else if (index == firstIndex) {
                    if (fullSum > bestFullSum){

                        //bestSampleSum = sum;

                        bestSampleRow = row;

                        bestFullSum = fullSum;

                        //bestSampleSum = bestFullSum;
                        printBestFullSum = true;

                        for (int j = 0; j < output.length; j++) {

                            output[j] = dnaSample[j];
                        }

                    }

                }
            }



            command = kbInput.nextLine();

        }


        bestSampleSum = 0;
        for (int i = 0; i < output.length; i++) {
            bestSampleSum += output[i];

        }

        if (bestSampleSum == 0){
            bestSampleRow = 1;
        }

        int finalSampleSum = printBestFullSum ? bestFullSum : bestSampleSum;

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSampleRow,finalSampleSum);

        String outputString  = Arrays.toString(output);

        System.out.println(outputString.replace("[","").replace("]","").replace(",",""));
    }
}
