package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner kbinput = new Scanner(System.in);
        int people = Integer.parseInt(kbinput.nextLine());
        int capacity = Integer.parseInt(kbinput.nextLine());

        int courses ;

        if (people < capacity){
            courses = 1;
        } else if (!(people % capacity == 0)) {
            courses = (people / capacity) + 1;
        }else {
            courses = people / capacity;
        }


        System.out.println(courses);
    }
}
