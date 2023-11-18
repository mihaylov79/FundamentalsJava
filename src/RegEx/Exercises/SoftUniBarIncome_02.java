package RegEx.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();
        String regEx = "%(?<name>[A-Z][a-z]+)%<(?<product>[A-Z][a-z]+)>\\|(?<qnty>\\d+)\\|(?<price>\\d+\\.?\\d+?)\\$";
        Pattern pattern = Pattern.compile(regEx);
        double total = 0;


        while(!"end of shift".equalsIgnoreCase(input)){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){

                double customerTotal = Integer.parseInt(matcher.group(3)) * Double.parseDouble(matcher.group(4));
                total += customerTotal;

                System.out.println(matcher.group(1) + ": "+ matcher.group(2) + " - "+ customerTotal );
            }

            input = kbInput.nextLine();


        }


    }
}
