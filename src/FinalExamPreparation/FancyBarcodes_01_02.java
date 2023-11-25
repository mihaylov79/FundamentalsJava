package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_01_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int count = Integer.parseInt(kbInput.nextLine());

        Pattern pattern = Pattern.compile("@#+(?<name>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");

        for (int i = 0; i < count; i++) {

            String input = kbInput.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){

                String product = matcher.group("name");
                char[] productCharArr = product.toCharArray();

                StringBuilder groupBuilder = new StringBuilder();
                groupBuilder.setLength(0);


                for (int j = 0; j < productCharArr.length; j++) {

                    if (Character.isDigit(productCharArr[j])){
                        groupBuilder.append(productCharArr[j]);
                    }

                }
                if (groupBuilder.length() > 0){
                    System.out.println("Product group: " + groupBuilder);
                }else {
                    System.out.println("Product group: 00");
                }



            }else {
                System.out.println("Invalid barcode");
            }

        }


    }
}
