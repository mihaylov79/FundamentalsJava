package Fundamentals_midExam_22_10_23;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);


        int citiesVisited = kbInput.nextInt();
//        String cityName = kbInput.nextLine();
//        double income = Double.parseDouble(kbInput.nextLine());
//        double expenses = Double.parseDouble(kbInput.nextLine());
        double profit;
        double tripProfit = 0;
        int cityCount = 0;

        for (int i = 1; i <= citiesVisited; i++) {

            String cityName = kbInput.nextLine();
            double income = Double.parseDouble(kbInput.nextLine());
            double expenses = Double.parseDouble(kbInput.nextLine());

            //cityName = kbInput.nextLine();
            //income = Double.parseDouble(kbInput.nextLine());
            //expenses = Double.parseDouble(kbInput.nextLine());
            cityCount++;

            if (i % 5 == 0 && i % 3 == 0){

                income -= (income * 0.1);
                profit = income - expenses;
                tripProfit +=profit;

                printCityProfit(cityName,profit);

            } else if (cityCount % 5 == 0) {

                income -= (income * 0.1);
                profit = income - expenses;
                tripProfit += profit;

                printCityProfit(cityName,profit);

            } else if (cityCount % 3 == 0) {

                expenses += (expenses * 0.5);
                profit = (income - expenses);
                tripProfit += profit;

                printCityProfit(cityName,profit);

            }else{
                profit = income - expenses;
                tripProfit += profit;

                printCityProfit(cityName,profit);

            }
//            cityName = kbInput.nextLine();
//            income = Double.parseDouble(kbInput.nextLine());
//            expenses = Double.parseDouble(kbInput.nextLine());


        }
        System.out.printf("Burger Bus total profit: %.2f",tripProfit);
    }

    public static void printCityProfit (String cityName, double profit){

        System.out.printf("In %s Burger Bus earned %.2f",cityName,profit);
    }
}
