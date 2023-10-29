package ObjectAndClasses.Lab.Songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int songNum = Integer.parseInt(kbInput.nextLine());

        List<Songs>songsList = new ArrayList<>();

        for (int i = 0; i < songNum; i++) {

            String[] data = kbInput.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Songs song = new Songs(type,name,time);

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songsList.add(song);

        }
        String listType = kbInput.nextLine();

        if ("all".equalsIgnoreCase(listType)){

            for (Songs song:songsList) {

                System.out.println(song.getName());
                
            }
        }else {
            for (Songs song: songsList) {

                if (song.getTypeList().equalsIgnoreCase(listType)){
                    System.out.println(song.getName());
                }

            }
        }


    }
}
