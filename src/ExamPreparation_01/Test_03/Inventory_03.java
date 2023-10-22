package ExamPreparation_01.Test_03;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);


        List<String> inventory = Arrays.stream(kbInput.nextLine()
                .split(", ")).collect(Collectors.toList());

        String input = kbInput.nextLine();



        while (!"Craft!".equalsIgnoreCase(input)){
            String[]commandInput = input.split(" - ");

            String command = commandInput[0];


            switch (command){

                case "Collect":
                    String item = commandInput[1];

                    if (!inventory.contains(item)){
                        inventory.add(item);
                    }
                    break;

                case "Drop":
                    item = commandInput[1];

                        inventory.remove(item);

                    break;

                case "Combine Items":
                    String[]items = commandInput[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    if(inventory.contains(oldItem)){
                        inventory.add(inventory.indexOf(oldItem)+1 , newItem);
                    }
                    break;

                case "Renew":
                    item = commandInput[1];
                    if (inventory.contains(item)){
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
            }

            input = kbInput.nextLine();


        }

        System.out.println(String.join(", ",inventory));

    }
}
