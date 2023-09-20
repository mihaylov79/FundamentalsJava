package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Messages_05_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordLength = Integer.parseInt(scan.nextLine());



        for (int i = 1; i <= wordLength ; i++) {
            int num = Integer.parseInt(scan.nextLine());

            String stringNum = Integer.toString(num);
            String md = String.valueOf(stringNum.charAt(0));
            int intMD = Integer.parseInt(md);

            int offset = (intMD - 2) *3;

            if (intMD == 8 || intMD == 9){
                offset = offset + 1;
            }
            int index = offset + stringNum.length() - 1;
            int ascii = 97 + index;
            if (intMD == 0){
                ascii = 32;
            }
            char letter = (char)ascii;

            System.out.print(letter);

        }
    }
}
