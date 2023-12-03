package Fundamentals_FinalExam_03_12;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String spellInput = kbInput.nextLine();

        String command = kbInput.nextLine();

        while (!"Abracadabra".equalsIgnoreCase(command)){

            String commandType = command.split(" ")[0];

            switch (commandType){

                case "Abjuration":

                    spellInput = spellInput.toUpperCase();

                    System.out.println(spellInput);

                    break;

                case "Necromancy":

                    spellInput = spellInput.toLowerCase();

                    System.out.println(spellInput);

                    break;

                case "Illusion":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    String letter = command.split(" ")[2];

                    if (index < spellInput.length()){

                        StringBuilder replacer = new StringBuilder(spellInput);

                        replacer.replace(index,index+1,letter);
                        spellInput = replacer.toString();
                        replacer.setLength(0);
                        System.out.println("Done!");
                    }else {
                        System.out.println("The spell was too weak.");
                    }

                    break;

                case "Divination":
                    String firstString = command.split(" ")[1];
                    String secndString = command.split(" ")[2];

                    if (spellInput.contains(firstString)){

                        spellInput = spellInput.replace(firstString,secndString);

                        System.out.println(spellInput);
                    }

                    break;

                case "Alteration":
                    String stringToRemove = command.split(" ")[1];

                    if (spellInput.contains(stringToRemove)){

                        spellInput = spellInput.replace(stringToRemove,"");

                        System.out.println(spellInput);
                    }

                    break;

                default:
                    System.out.println("The spell did not work!");
                    break;
            }



            command = kbInput.nextLine();
        }


    }
}
