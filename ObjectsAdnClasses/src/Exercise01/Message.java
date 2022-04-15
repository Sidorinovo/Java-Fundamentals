package Exercise01;

import java.util.Random;

public class Message {
    private static final String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    private static final String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private static final String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private static final String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public static void generateMessage(int repetitions){
        Random rand = new Random();
        for (int i = 0; i < repetitions; i++) {
            String phrase = phrases[rand.nextInt(phrases.length)];
            String event = events[rand.nextInt(events.length)];
            String author = authors[rand.nextInt(authors.length)];
            String city = cities[rand.nextInt(cities.length)];

            System.out.printf("%s %s %s - %s\n",phrase, event, author, city);
        }
    }
}
