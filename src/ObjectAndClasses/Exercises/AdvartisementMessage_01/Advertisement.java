package ObjectAndClasses.Exercises.AdvartisementMessage_01;

import java.util.Random;

public class Advertisement {

    private Random random = new Random();


    private String[] phrases = {"Excellent product.","Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."};

    private String[] event = {"Now I feel good.", "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"};


    private String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

    private String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};



    public String randomMessage(){

         String phraseMsg = phrases[random.nextInt(phrases.length)];
         String eventMsg = event[random.nextInt(event.length)];
         String authorMsg = author[random.nextInt(author.length)];
         String cityMsg = city[random.nextInt(city.length)];



        return String.format("%s %s %s - %s", phraseMsg,eventMsg,authorMsg,cityMsg);
    }

}
