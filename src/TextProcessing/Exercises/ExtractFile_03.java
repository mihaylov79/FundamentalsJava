package TextProcessing.Exercises;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        StringBuilder name = new StringBuilder("File name: ");
        StringBuilder ext = new StringBuilder("File extension: ");

        String[] dataInput = kbInput.nextLine().split("\\\\");
        String file = dataInput[dataInput.length - 1];
        String fileName = file.split("\\.")[0];
        String extension = file.split("\\.")[1];

        name.append(fileName);
        ext.append(extension);

        System.out.println(name);
        System.out.println(ext);
    }
}
