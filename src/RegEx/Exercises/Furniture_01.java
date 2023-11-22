package RegEx.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();
        List<String> productNames = new ArrayList<>();
        double total = 0;

        Pattern pattern = Pattern.compile("^>>(?<product>[A-Za-z]*)<<(?<price>\\d+.?\\d*)!(?<qty>\\d*)");


        while (!"Purchase".equalsIgnoreCase(input)){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                productNames.add(matcher.group("product"));
                double singlePrice = Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("qty"));

                total += singlePrice;

            }

            input= kbInput.nextLine();
        }
        System.out.println("Bought furniture:");

        for (String product: productNames) {
            System.out.println(product);
        }

        System.out.printf("Total money spend: %.2f%n",total);
    }
}
