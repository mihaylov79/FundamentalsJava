package Fundamentals_midExam_22_10_23;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);


        int citiesVisited = Integer.parseInt(kbInput.nextLine());

        double profit;
        double tripProfit = 0;
        int cityCount = 0;

        while (!(citiesVisited == 0)) {

            String cityName = kbInput.nextLine();
            double income = Double.parseDouble(kbInput.nextLine());
            double expenses = Double.parseDouble(kbInput.nextLine());

            cityCount++;
            citiesVisited--;

            if (cityCount % 5 == 0 && cityCount % 3 == 0){

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

        }
        System.out.printf("Burger Bus total profit: %.2f%n",tripProfit);
    }

    public static void printCityProfit (String cityName, double profit){

        System.out.printf("In %s Burger Bus earned %.2f%n",cityName,profit);
    }
}
