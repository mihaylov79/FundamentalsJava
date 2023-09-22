package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int yield = Integer.parseInt(kbInput.nextLine());
        int harvested = 0;
        int dayCount = 0;

        while (yield >= 100){

            harvested += yield - 26;
            dayCount++;
            yield = yield - 10;
        }
            harvested -= 26;

        if (harvested < 0){
            harvested = 0;
        }

        System.out.println(dayCount);
        System.out.println(harvested);
    }
}
