package Lists.Exercises;

import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<String> input = Arrays.stream(kbInput.nextLine()
                .split("")).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {

            if (input.get(i).matches("^\\d+") && input.get(i+1).matches("^\\d+") ){
                input.set(i, input.get(i) + input.get(i+1));
                input.remove(i+1);
            }

            if (input.get(i).contains(" ")) {
                input.remove(i);
                i--;
            }
            if (input.get(i).contains("-")) {
                input.set(i + 1, "-" + input.get(i + 1));
                input.remove(i);
            }

        }
        System.out.println(input);


        List<Integer> output = new ArrayList<>();
        List<Integer> currentArray = new ArrayList<>();

        while (!input.isEmpty()) {

            for (int i = input.size() - 1; i >= 0; i--) {

                currentArray.clear();

                if (input.get(i).equals("|") || i == 0) {
                    if ((i + 1) <= input.size() - 1 && input.get(i + 1).equals("|") || (i - 1) >= 0 && input.get(i - 1).equals("|")) {
                        input.remove(i);
                        break;
                    }

                    int breakIndex = i;


                    if (breakIndex > 0) {
                        breakIndex += 1;
                    }
                    for (int j = breakIndex; j < input.size(); j++) {

                        currentArray.add(Integer.parseInt(input.get(j)));

                    }

                    if (breakIndex > 0) {
                        breakIndex -= 1;
                    }

                    input.subList(breakIndex, input.size()).clear();
                    output.addAll(currentArray);

                }
            }

        }
        for (int elements : output) {
            System.out.print(elements + " ");

        }

    }
}
