package ObjectAndClasses.Exercises.OpiniopPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<Person>personInfo = new ArrayList<>();

        int n = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < n; i++) {

            String[] data = kbInput.nextLine().split(" ");
            String name = data[0];
            String age = data[1];

            Person person = new Person(name,age);

            person.setName(name);
            person.setAge(age);

            if (Integer.parseInt(age) > 30){
                personInfo.add(person);
            }



        }

        for (Person person : personInfo) {

            System.out.println(String.join(" - ", person.getName(), person.getAge()));

        }
    }
}
