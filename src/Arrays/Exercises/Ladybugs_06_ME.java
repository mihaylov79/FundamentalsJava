package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs_06_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);



        int fieldLength = Integer.parseInt(kbInput.nextLine());

        int[] field = new int[fieldLength];

        int[] ladybugPositions = Arrays.stream(kbInput.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < ladybugPositions.length; i++) {
           field[i] = 1;

        }

        String position = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(position)){
//            if (ladybugPositions.length == fieldLength){
//                break;
//            }

            String[] direction = position.split(" ");

            if (direction[1].equalsIgnoreCase("right")){

                int posIndex = Integer.parseInt(direction[0]);
                int flightIndex = Integer.parseInt(direction[2]);

                if (posIndex + flightIndex > fieldLength - 1){
                    field[posIndex] = 0;
                    break;
                }



                    if (field[posIndex + flightIndex] == 1) {
                        if (fieldLength > (posIndex + flightIndex + 1)) {

                            field[posIndex] = 0;
                            flightIndex += posIndex + 1;
                            if (field[flightIndex] == 1) {
                                flightIndex += 1;
                                if (flightIndex <= fieldLength - 1) {
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

                if (posIndex - flightIndex < 0){
                    field[posIndex] = 0;
                    break;
                }

                if (0 <= (posIndex - flightIndex )){

                    if (field[posIndex - flightIndex] == 1) {

                        if (posIndex - flightIndex + 1 >=0){
                            field[posIndex] = 0;
                            flightIndex = (posIndex - (flightIndex + 1));

                            if (flightIndex >= 0) {
                                field[flightIndex] = 1;
                            }else {
                                field[posIndex] = 0;
                                break;
                            }
                        }

                    }else {
                        field[posIndex] = 0;
                        flightIndex = posIndex - (flightIndex + 1);
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
