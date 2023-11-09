package AssociativeArrays.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        LinkedHashMap<String,Integer>farmingData = new LinkedHashMap<>();
        farmingData.put("shards",0);
        farmingData.put("fragments",0);
        farmingData.put("motes",0);

        boolean isObtained = false;
       // String[] dataInput = kbInput.nextLine().split(" ");
        List<String>dataInput;



        while (!isObtained) {
            boolean ShadowmourneObtained = false;
            boolean ValanyrObtained = false;
            boolean DragonwrathObtained = false;
            dataInput = Arrays.stream(kbInput.nextLine().toLowerCase().split(" ")).collect(Collectors.toList());
            //Collections.reverse(dataInput);

            for (int i = 0; i < dataInput.size(); i += 2) {

                if (farmingData.containsKey(dataInput.get(i + 1))){
                   // farmingData.get(dataInput.get(i));
                    farmingData.put(dataInput.get(i + 1),farmingData.get(dataInput.get(i + 1))
                                    + Integer.parseInt(dataInput.get(i) ));

                    for (Map.Entry<String,Integer>entry: farmingData.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase("shards") && entry.getValue() >= 250){
                            ShadowmourneObtained = true;
                            break;
                        } else if (entry.getKey().equalsIgnoreCase("fragments") && entry.getValue() >= 250) {
                            ValanyrObtained = true;
                            break;
                        } else if (entry.getKey().equalsIgnoreCase("motes") && entry.getValue() >= 250) {
                            DragonwrathObtained = true;
                            break;
                        }
                    }
                }else {
                    farmingData.put(dataInput.get(i + 1), Integer.parseInt(dataInput.get(i)));

                }
                if (ShadowmourneObtained){
                    System.out.println("Shadowmourne obtained!");
                    farmingData.put("shards", farmingData.get("shards") - 250);
                    isObtained = true;
                    break;
                } else if (ValanyrObtained) {
                    System.out.println("Valanyr obtained!");
                    farmingData.put("fragments", farmingData.get("fragments") - 250);
                    isObtained = true;
                    break;
                } else if (DragonwrathObtained) {
                    System.out.println("Dragonwrath obtained!");
                    farmingData.put("motes", farmingData.get("motes") - 250);
                    isObtained = true;
                    break;
                }


            }




        }

        for (Map.Entry<String,Integer>entry: farmingData.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());

        }

    }

}
