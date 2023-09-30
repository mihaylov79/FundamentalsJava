package Arrays.Exercises;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int wagons = Integer.parseInt(kbInput.nextLine());

        int[] people = new int[wagons];
        int peopleSum = 0;

        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(kbInput.nextLine());
            peopleSum += people[i];
        }

        for (int peoples:people) {
            System.out.print(peoples + " ");
        }
        System.out.println();
        System.out.println(peopleSum);

//        System.out.print(Arrays.toString(people)
//                .replace("[","")
//                .replace("]",""));
//        System.out.println();
//        System.out.println(peopleSum);

    }
}
