package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupMembers = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double total = 0;

        switch (day){
            case "Friday":
                switch (type){
                    case "Students":
                        if (groupMembers >= 30){
                            total = (groupMembers * 8.45) - ((groupMembers * 8.45) * 0.15);
                        }else {
                            total = groupMembers * 8.45;
                        }
                        break;
                    case "Business":
                        if (groupMembers >= 100){
                            total = (groupMembers - 10) * 10.90;
                        }else {
                            total = groupMembers * 10.90;
                        }
                        break;
                    case "Regular":
                        if (groupMembers >= 10 && groupMembers <= 20){
                            total = (groupMembers * 15) - ((groupMembers * 15) * 0.05);
                        }else {
                            total = groupMembers * 15;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        if (groupMembers >= 30){
                            total = (groupMembers * 9.80) - ((groupMembers * 9.8) * 0.15);
                        }else {
                            total = groupMembers * 9.8;
                        }
                        break;
                    case "Business":
                        if (groupMembers >= 100){
                            total = (groupMembers - 10) * 15.60;
                        }else {
                            total = groupMembers * 15.60;
                        }
                        break;
                    case "Regular":
                        if (groupMembers >= 10 && groupMembers <= 20){
                            total = (groupMembers * 20) - ((groupMembers * 20) * 0.05);
                        }else {
                            total = groupMembers * 20;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        if (groupMembers >= 30){
                            total = (groupMembers * 10.46) - ((groupMembers * 10.46) * 0.15);
                        }else {
                            total = groupMembers * 10.46;
                        }
                        break;
                    case "Business":
                        if (groupMembers >= 100){
                            total = (groupMembers - 10) * 16;
                        }else {
                            total = groupMembers * 16;
                        }
                        break;
                    case "Regular":
                        if (groupMembers >= 10 && groupMembers <= 20){
                            total = (groupMembers * 22.5) - ((groupMembers * 22.5) * 0.05);
                        }else {
                            total = groupMembers * 22.5;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f",total);
    }
}
