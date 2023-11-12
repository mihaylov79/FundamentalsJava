package TextProcessing.Exercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();
        StringBuilder output = new StringBuilder();

        char[] listArray = input.toCharArray();

        for (int i = 0; i < listArray.length; i++) {

            if(listArray[i] == '>'){
                output.append(listArray[i]);
                int explodeIndex = Integer.parseInt(String.valueOf(listArray[i + 1]));
                if (explodeIndex > 1){

                    for (int j = i+1; j < i + 1 + explodeIndex ; j++) {
                        int counter = 0;
                        if (j < 0 || j > listArray.length - 1){
                            break;
                        }
                        if (listArray[j] == '>'){
                            output.append(listArray[j]);
                            counter++;
                            int explodeIndex2 = Integer.parseInt(String.valueOf(listArray[j+1]));

                            explodeIndex += explodeIndex2 + counter;
                        }


                    }
                }
                if (explodeIndex >= 0 && explodeIndex <= (listArray.length -1) - i){
                    i += explodeIndex;
                }else{
                    explodeIndex = (listArray.length -1) - i;
                    i+=explodeIndex;
                }



            }else {
                output.append(listArray[i]);
            }

        }

        System.out.println(output);
    }
}
