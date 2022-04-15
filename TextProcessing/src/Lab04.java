import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < words.length; i++) {
            text = removeWord(words[i], text);
        }

        System.out.println(text);
    }

    private static String removeWord(String word, String text) {
        String replacement = replacement(word);

        while(text.contains(word)){
            text = text.replaceAll(word, replacement);
        }
        return text;
    }

    private static String replacement(String word) {
        String replacement = "";
        for (int i = 0; i < word.length(); i++) {
            replacement = replacement.concat("*");
        }
        return replacement;
    }
}
