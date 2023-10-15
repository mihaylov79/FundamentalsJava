package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String player1Input = kbInput.nextLine();
        String player2Input = kbInput.nextLine();

        List<Integer> deck1 = Arrays.stream(player1Input.split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream(player2Input.split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());


        while (!deck1.isEmpty() && !deck2.isEmpty()){

            int i = 0;
            if (deck1.get(i) > deck2.get(i)){
                deck1.add(deck1.get(i));
                deck1.add(deck2.get(i));
                deck1.remove(i);
                deck2.remove(i);
                i++;

            } else if (deck1.get(i) < deck2.get(i)) {
                deck2.add(deck2.get(i));
                deck2.add(deck1.get(i));
                deck2.remove(i);
                deck1.remove(i);
                i++;
            }else {
                deck1.remove(i);
                deck2.remove(i);
                i++;
            }

        }

        if (!deck1.isEmpty()){

            String player = "First player";
            printDeck(deck1,player);

        }else {

            String player = "Second player";
            printDeck(deck2,player);

        }
    }

    public static void printDeck(List<Integer>deck, String player){
        int sum = 0;
        for (int elements: deck) {
            sum += elements;
        }
        System.out.printf("%s wins! Sum: %d",player,sum);
    }
}
