package ObjectAndClasses.Exercises.OrderByAge_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Person>personData = new ArrayList<>();

        String data = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(data)){

            String[] dataArray = data.split(" ");

            String name = dataArray[0];
            String ID = dataArray[1];
            int age = Integer.parseInt(dataArray[2]);

            Person personInfo = new Person(name,ID,age);

            personData.add(personInfo);

            data = kbInput.nextLine();

        }

        personData.sort(Comparator.comparing(Person::getAge));

        for (Person person: personData) {

            System.out.printf("%s with ID: %s is %d years old.%n",
                        person.getName(),person.getID(),person.getAge());

        }


    }
}
