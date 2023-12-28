package Practise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResult {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        Map<String,Stats> info = new LinkedHashMap<>();
        Map<String,Integer> submissions = new LinkedHashMap<>();

        String input = kbInput.nextLine();

        while (!input.equalsIgnoreCase("exam finished")){
            String name = input.split("-")[0];
            String lang = input.split("-")[1];

            if (lang.equals("banned")){

                info.remove(name);

            }else {
                int points = Integer.parseInt(input.split("-")[2]);
                if (info.containsKey(name)){

                    Stats existing = info.get(name);

                    submissions.replace(lang, submissions.get(lang) + 1);

                    if (existing.getPoints() < points){
                        existing.setPoints(points);
                        existing.setLanguage(lang);
                    }


                }else{
                    Stats stats = new Stats(lang,points);

                    info.put(name,stats);

                    if (submissions.containsKey(lang)){
                        submissions.replace(lang, submissions.get(lang) + 1);
                    }else{
                        submissions.put(lang,1);
                    }

                }



            }

            input = kbInput.nextLine();


        }

        System.out.println("Results:");
        for (Map.Entry<String,Stats>entry : info.entrySet()){

            Stats stats = entry.getValue();

            System.out.printf("%s | %d%n",entry.getKey(),stats.getPoints());
        }

        System.out.println("Submissions:");

        for (Map.Entry<String,Integer>entry : submissions.entrySet()){

            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        }


    }

    public static class Stats {

        private String language;
        private int points;


        public Stats(String language, int points) {

            this.language = language;
            this.points = points;

        }

        public String getLanguage(){
            return this.language;
        }

        public int getPoints(){
            return this.points;
        }

        public void setLanguage(String language){
            this.language = language;
        }

        public void setPoints(int points){
            this.points = points;
        }



    }
}
