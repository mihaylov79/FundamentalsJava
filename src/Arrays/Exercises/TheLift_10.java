package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int people = Integer.parseInt(kbInput.nextLine());

        int[] wagons = Arrays.stream(kbInput.nextLine()
                       .split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        int peopleLeft = people;
        int availableSeats = 0;
        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            sum += wagons[i];
        }
        availableSeats += (wagons.length * 4) - sum;

        for (int i = 0; i < wagons.length; i++) {

            if (peopleLeft <= 0){
                break;
            }

            for (int j = 0; j < 4; j++) {
                if (wagons[i] == 4) {
                    break;
                }
                wagons[i] = wagons[i] + 1;
                peopleLeft -= 1;
                availableSeats -= 1;

                if (peopleLeft <= 0 ) {

                    if (availableSeats > peopleLeft){
                        System.out.println("The lift has empty spots!");
                        break;
                    }
                    if (availableSeats == 0){
                        break;
                    }
                }
            }
        }
        if (peopleLeft > 0 ) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleLeft);

        }
        for (int seats:wagons) {
            System.out.print(seats + " ");
        }

    }
}
