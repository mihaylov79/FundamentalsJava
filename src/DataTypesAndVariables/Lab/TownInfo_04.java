package DataTypesAndVariables.Lab;

        import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String town = kbInput.nextLine();
        int population = Integer.parseInt(kbInput.nextLine());
        int area = Integer.parseInt(kbInput.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,population,area);


    }
}
