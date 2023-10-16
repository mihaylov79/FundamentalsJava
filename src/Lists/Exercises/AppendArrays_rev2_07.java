package Lists.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_rev2_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<String> input = Arrays.stream(kbInput.nextLine()
                .split("\\|")).collect(Collectors.toList());

        Collections.reverse(input);

        System.out.println(input.toString().replace("[", "")
                                            .replace("]", "").trim()
                                            .replaceAll(",", "")
                                            .replaceAll("\\s+", " "));


    }
}
