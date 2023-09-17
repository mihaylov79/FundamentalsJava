package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double lightSaberPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        double lightsaber = Math.ceil(students + (students * 0.1)) * lightSaberPrice;
        double robes = students * robesPrice;
        double belts = (students - (students / 6)) * beltPrice;

        double total = lightsaber + robes + belts;
        if (total <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",total-budget);
        }


    }
}
