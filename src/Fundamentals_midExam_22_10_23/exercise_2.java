package Fundamentals_midExam_22_10_23;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        List<String> friendsList = Arrays.stream(Scan.nextLine()
                                    .split(", ")).collect(Collectors.toList());

        int blackListCount = 0;
        int errorCount = 0;

        String commandInput = Scan.nextLine();


        while (!"Report".equalsIgnoreCase(commandInput)){
            String[] command = commandInput.split(" ");
            String commandType = command[0];
            String commandIndex = command[1];


            switch (commandType){

                case "Blacklist":
                    if (!friendsList.contains(commandIndex)){
                        System.out.printf("%s was not found.%n",commandIndex);
                    }else {
                        friendsList.set(friendsList.indexOf(commandIndex),"Blacklisted" );
                        System.out.printf("%s was blacklisted.%n",commandIndex);
                        blackListCount++;
                    }

                    break;

                case "Error":
                    int index = Integer.parseInt(commandIndex);
                    if (isValid(friendsList,index)){
                        if (!friendsList.get(index).equalsIgnoreCase("Blacklisted")
                                && !friendsList.get(index).equalsIgnoreCase("Lost")){
                            String name = friendsList.get(index);
                            friendsList.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n",name);
                            errorCount++;
                        }
                    }

                    break;

                case "Change":
                    index = Integer.parseInt(command[1]);
                    if (isValid(friendsList,index)){
                        String newName = command[2];
                        String oldName = friendsList.get(index);
                        friendsList.set(index, newName);

                        System.out.printf("%s changed his username to %s.%n",oldName,newName);

                    }

                    break;
            }
            commandInput = Scan.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n",blackListCount);
        System.out.printf("Lost names: %d%n",errorCount);
        System.out.print(String.join(" ", friendsList));






    }

    public static boolean isValid (List<String>friendList, int index){
        return index >= 0 && index <= friendList.size() - 1;
    }
}
