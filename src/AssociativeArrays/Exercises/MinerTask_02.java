package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        LinkedHashMap<String, Integer>resources = new LinkedHashMap<>();

        String resType = kbInput.nextLine();


        while (!"stop".equalsIgnoreCase(resType)){

            int resQuantity = Integer.parseInt(kbInput.nextLine());

            if (resources.containsKey(resType)){
                resources.put(resType,resources.get(resType) + resQuantity);
            }else {
                resources.put(resType,resQuantity);
            }



            resType = kbInput.nextLine();
        }

        for (Map.Entry<String,Integer>entry: resources.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
