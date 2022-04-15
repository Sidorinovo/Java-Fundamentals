import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        vowelCount(input);
    }

    private static void vowelCount(String input) {
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == 'a' || current == 'o' || current == 'u' || current == 'e' || current == 'i') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
