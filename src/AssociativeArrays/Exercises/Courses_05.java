package AssociativeArrays.Exercises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        LinkedHashMap<String, List<String>>coursesInfo = new LinkedHashMap<>();

        String dataInput = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(dataInput)){
            String[] dataArray = dataInput.split(" : ");
            String courseName = dataArray[0];
            String studentName = dataArray[1];

            if (coursesInfo.containsKey(courseName)){
                coursesInfo.get(courseName).add(studentName);

            }else {
                coursesInfo.put(courseName, new ArrayList<>());
                coursesInfo.get(courseName).add(studentName);
            }
            dataInput = kbInput.nextLine();
        }

        for (Map.Entry<String,List<String>>entry: coursesInfo.entrySet()) {

            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            entry.getValue().forEach(student-> System.out.printf("-- %s%n",student));

        }
    }
}
