package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs_06_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);



        int fieldLength = Integer.parseInt(kbInput.nextLine());
        boolean inRange = true;

        int[] field = new int[fieldLength];

        int[] ladybugPositions = Arrays.stream(kbInput.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            for (int i = 0; i < ladybugPositions.length; i++) {
                if (ladybugPositions[i] <= field.length - 1 && ladybugPositions[i] >= 0){
                    field[ladybugPositions[i]] = 1;
                }else {
                    inRange = false;
                }
            }



        String position = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(position)){

            String[] direction = position.split(" ");

            if (direction[1].equalsIgnoreCase("right")){

                int posIndex = Integer.parseInt(direction[0]);
                int flightIndex = Integer.parseInt(direction[2]);

                if (posIndex + flightIndex > fieldLength - 1 && inRange && field[posIndex] == 1){
                    field[posIndex] = 0;
                    break;
                }



                    if (field[posIndex + flightIndex] == 1 && inRange && field[posIndex] == 1 ) {
                        if (fieldLength > (posIndex + flightIndex + 1)) {

                            field[posIndex] = 0;
                            int flightIndexNew = posIndex + flightIndex;
                            if (field[flightIndexNew] == 1) {
                                flightIndexNew += flightIndex;
                                if (flightIndexNew <= fieldLength - 1) {
                                    field[flightIndex] = 1;
                                }
                                //field[posIndex] = 0;
                            } else {
                                field[posIndex] = 0;
                                flightIndex += posIndex;
                                field[flightIndex] = 1;
                            }
                        }else{
                            field[posIndex] = 0;
                        }

                    }

            } else if (direction[1].equalsIgnoreCase("left")) {

                int posIndex = Integer.parseInt(direction[0]);
                int flightIndex = Integer.parseInt(direction[2]);

                if (posIndex - flightIndex < 0 && inRange && field[posIndex] == 1){
                    field[posIndex] = 0;
                    break;
                }

                if (0 <= (posIndex - flightIndex ) && inRange && field[posIndex]== 1){

                    if (field[posIndex - flightIndex] == 1 && field[posIndex] == 1) {

                        if (posIndex - flightIndex + flightIndex >=0){
                            field[posIndex] = 0;
                            int flightIndexNew = (posIndex - (flightIndex + flightIndex));

                            if (flightIndexNew >= 0) {
                                field[flightIndexNew] = 1;
                            }else {
                                field[posIndex] = 0;
                                break;
                            }
                        }

                    }else {
                        field[posIndex] = 0;
                        flightIndex = posIndex - (flightIndex);
                        if (flightIndex >=0){
                            field[flightIndex] = 1;
                        }

                    }
                }
            }

            position = kbInput.nextLine();

        }
        for (int index: field) {
            System.out.print(index + " ");
        }


    }


}
