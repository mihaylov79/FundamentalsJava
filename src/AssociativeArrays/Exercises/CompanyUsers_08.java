package AssociativeArrays.Exercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        LinkedHashMap<String, List<String>> idInfo = new LinkedHashMap<>();

        String dataInput = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(dataInput)){

            String[] dataArray = dataInput.split(" -> ");
            String key = dataArray[0];
            String value = dataArray[1];

            if (!idInfo.containsKey(key)){

                idInfo.put(key,new ArrayList<>());
                idInfo.get(key).add(value);

            }else {

                if(!idInfo.get(key).contains(value)){
                    idInfo.get(key).add(value);
                }
            }
            dataInput= kbInput.nextLine();

        }

        for (Map.Entry<String,List<String>>entry: idInfo.entrySet()) {
            String company = entry.getKey();
            System.out.println(company);
            for (String id: entry.getValue()) {
                System.out.printf("-- %s%n",id);
            }

        }
    }
}
