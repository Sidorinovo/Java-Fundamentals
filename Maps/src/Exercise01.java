import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        Map<String, Integer> lettersList = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            addToList(input[i], lettersList);
        }

        lettersList.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
    }

    private static void addToList(String word, Map<String, Integer> lettersList) {
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));
            lettersList.putIfAbsent(letter, 0);
            lettersList.put(letter, lettersList.get(letter) + 1);
        }
    }
}
