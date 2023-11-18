package RegEx.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();
        String regEx = "%(?<name>[A-Z][a-z]+)%[^|%$.]*?<(?<product>\\w+)>[^|%$.]*?\\|(?<qnty>\\d+)\\|[^|%$.]*?(?<price>\\d+(\\.\\d+)?)\\$";
        Pattern pattern = Pattern.compile(regEx);
        double total = 0;


        while(!"end of shift".equalsIgnoreCase(input)){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){

                double customerTotal = Integer.parseInt(matcher.group("qnty")) * Double.parseDouble(matcher.group("price"));
                total += customerTotal;

                System.out.printf("%s: %s - %.2f%n",matcher.group("name"),matcher.group("product"),customerTotal );
            }

            input = kbInput.nextLine();


        }
        System.out.printf("Total income: %.2f%n",total);


    }
}
