package BasicSyntax.ConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int mins = Integer.parseInt(scan.nextLine());

        if (mins + 30 > 59) {
            hours++;
            mins = (mins + 30) - 60;
        } else {
            mins += 30;
        }
            if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d",hours,mins);
    }

}
