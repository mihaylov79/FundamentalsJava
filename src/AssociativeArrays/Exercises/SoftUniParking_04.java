package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        LinkedHashMap<String,String> users = new LinkedHashMap<>();
        int commandNum = Integer.parseInt(kbInput.nextLine());



        for (int i = 0; i < commandNum; i++) {
            String[] dataArray = kbInput.nextLine().split(" ");
            String commandType = dataArray[0];
            String username = dataArray[1];


            switch (commandType){
                case "register":
                    String registrationPlate = dataArray[2];
                    if (users.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",users.get(username));
                    }else{
                        users.put(username, registrationPlate);
                        System.out.printf("%s registered %s successfully%n",username,registrationPlate);
                    }

                    break;
                case "unregister":
                    if (!users.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else {
                        users.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }

                    break;
            }
            //dataInput = kbInput.nextLine();
        }

        for (Map.Entry<String,String>entry: users.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }


    }
}
