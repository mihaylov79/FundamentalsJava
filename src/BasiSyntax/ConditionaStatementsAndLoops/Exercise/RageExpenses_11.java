package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int trashedHeadsets = lostGames / 2;
        int trashedMouses = lostGames / 3;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;
        int trashKbCount = 0;
        for (int i = 2; i <= lostGames; i+=2) {
            if (trashKbCount == 2){
                trashKbCount = 0;
            }
            if (i % 3 == 0){
                    trashedKeyboards++;
                    trashKbCount++;
            }
            if (trashKbCount >1 && trashedKeyboards % 2 == 0){
                trashedDisplays++;
            }
        }



        double total = (trashedDisplays * displayPrice) + (trashedHeadsets * headsetPrice) + (trashedKeyboards * keyboardPrice) + (trashedMouses * mousePrice);

        System.out.printf("Rage expenses: %.2f lv.",total);

    }
}
