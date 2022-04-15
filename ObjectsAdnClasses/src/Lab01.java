import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");

        Random ran = new Random();

        for (int i = 0; i < words.length; i++) {
            int random = ran.nextInt(words.length);
            String current = words[i];
            words[i] = words[random];
            words[random] = current;
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
