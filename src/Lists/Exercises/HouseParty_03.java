package Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int commandCount = Integer.parseInt(kbInput.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < commandCount; i++) {

            String command = kbInput.nextLine();

            String[] commandInput =  command.split( " ");
            String name = commandInput[0];

            if (commandInput.length == 3){

                if(!list.contains(name)){
                    list.add(name);
                    //System.out.printf("%s added%n",name);
                }else {
                    System.out.printf("%s is already in the list!%n",name);
                }

            }else {
                if (list.contains(name)){
                    list.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }
        for (String name: list) {

            System.out.println(name);


        }
    }
}


