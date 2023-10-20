package ExamPreparation_01.Test02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        double average;
        int sum = 0;

        List<Integer> input = Arrays.stream(kbInput.nextLine()
                            .split(" ")).map(Integer::parseInt)
                            .collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);

        }
            average = (double) sum / input.size();



        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {

            if (input.get(i) > average){
                output.add(input.get(i));
            }

        }
        Collections.sort(output);
        Collections.reverse(output);

        if (output.isEmpty()){
            System.out.println("No");
            return;
        }

        if (output.size() > 5){
            for (int i = output.size() - 1; i > 4 ; i--) {
                output.remove(output.size() - 1);

            }
        }

        List<String>outputStr = output.stream()
                                .map(String::valueOf)
                                .collect(Collectors.toList());

        System.out.print(String.join(" ",outputStr));










    }
}
