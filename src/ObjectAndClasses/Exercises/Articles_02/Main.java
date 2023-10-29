package ObjectAndClasses.Exercises.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] data = kbInput.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

       Article article = new Article(title, content, author);

        int commandNum = Integer.parseInt(kbInput.nextLine());

        for (int i = 1; i <=commandNum; i++) {
            //String commandData = kbInput.nextLine();

            String[] commandInput = kbInput.nextLine().split(": ");
            String commandType = commandInput[0];
            String commandOrder = commandInput[1];

            switch (commandType){
                case "Edit":
                    article.edit(commandOrder);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandOrder);
                    break;
                case "Rename":
                    article.rename(commandOrder);
                    break;
            }
        }
        System.out.printf("%s - %s: %s",article.getTitle(),
                                        article.getContent(),article.getAuthor());



    }
}
