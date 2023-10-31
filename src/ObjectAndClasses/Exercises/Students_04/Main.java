package ObjectAndClasses.Exercises.Students_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        
        int cmdCount = Integer.parseInt(kbInput.nextLine());

        List<Student> studentsData = new ArrayList<>();


        for (int i = 0; i < cmdCount; i++) {

            String[] dataInput = kbInput.nextLine().split(" ");
            String firstName = dataInput[0];
            String lastName = dataInput[1];
            double grade = Double.parseDouble(dataInput[2]);

            Student student = new Student(firstName,lastName,grade);

            studentsData.add(student);
            
        }

        Collections.sort(studentsData, Comparator.
                    comparing(Student::getGrade).reversed());

        for (Student student: studentsData) {
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getLastName(),student.getGrade());

        }
        
        


    }
}
