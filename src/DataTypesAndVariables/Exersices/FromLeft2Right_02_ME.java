package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class FromLeft2Right_02_ME {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        int combinations = Integer.parseInt(kbInput.nextLine());


        for (int i = 0; i < combinations; i++) {
            String data = kbInput.nextLine();

            String firstNumber = "";
            String secondNumber = "";


            for (int j = 0; j < data.length(); j++) {


                if (!Character.isSpaceChar(data.charAt(j))) {
                    firstNumber += data.charAt(j);
                }

                if (Character.isSpaceChar(data.charAt(j))) {
                    //space += data.charAt(j);

                    for (int k = j + 1; k < data.length(); k++) {
                        secondNumber += data.charAt(k);
                    }

                    long intNum1 = Long.parseLong(firstNumber);
                    long intNum2 = Long.parseLong(secondNumber);
                    long sum = 0;

                    if (intNum1 > intNum2){
                        while (!(intNum1 == 0)){

                            sum += (intNum1 % 10);
                            intNum1 /= 10;
                        }
                        System.out.println(Math.abs(sum));

                    }else {
                        while (!(intNum2 == 0)){

                            sum += (intNum2 % 10);
                            intNum2 /= 10;
                        }
                        System.out.println(Math.abs(sum));

                    }
                }
                //firstNumber += data.charAt(j);

                if (Character.isSpaceChar(data.charAt(j))){
                  break;
                }
            }
        }
    }



}
