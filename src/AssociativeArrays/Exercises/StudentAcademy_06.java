package AssociativeArrays.Exercises;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        Map<String,List<Double>> info = new LinkedHashMap<>();

        int n = Integer.parseInt(kbInput.nextLine());


        for (int i = 0; i < n; i++) {

            String name = kbInput.nextLine();
            double grade = Double.parseDouble(kbInput.nextLine());

            if (info.containsKey(name)){

                info.get(name).add(grade);

            }else {
                info.put(name,new ArrayList<>());
                info.get(name).add(grade);
            }

        }
        Map<String,Double>averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String,List<Double>>entry: info.entrySet()) {
            String name = entry.getKey();
            List<Double> grade = entry.getValue();
            double average = grade.stream().mapToDouble(a -> a).average().orElse(0.0);

            if (average >= 4.50){

                averageGrade.put(name,average);
            }

        }
        averageGrade.entrySet().stream().forEach(entry1 -> System.out.printf("%s -> %.2f%n",entry1.getKey(),entry1.getValue()));
    }
}
