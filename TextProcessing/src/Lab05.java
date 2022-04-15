import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String digits = digits(input);
        String letters = letters(input);
        String other = other(input);
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }

    private static String other(String input) {
        String other = "";
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) && (!Character.isAlphabetic(input.charAt(i)))){
                other = other.concat(String.valueOf(input.charAt(i)));
            }
        }
        return other;
    }

    private static String letters(String input) {
        String letters = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))){
                letters = letters.concat(String.valueOf(input.charAt(i)));
            }
        }
        return letters;

    }

    private static String digits(String input) {
        String digits = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                digits = digits.concat(String.valueOf(input.charAt(i)));
            }
        }
        return digits;
    }
}
