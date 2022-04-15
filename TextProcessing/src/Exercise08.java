import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strings = scan.nextLine().split("\\s+");
        double sum = 0;

        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            sum += sumOfString(current);
        }
        System.out.printf("%.2f", sum);
    }

    private static double sumOfString(String current) {

        double number = Double.parseDouble(current.substring(1, current.length() - 1));
        char first = current.charAt(0);
        char second = current.charAt(current.length() - 1);
        boolean isUpperFirst = Character.isUpperCase(first);
        boolean isUpperSecond = Character.isUpperCase(second);
        int firstNumber = extractPosition(first);
        int secondNumber = extractPosition(second);

        if (isUpperFirst) {
            number = number / firstNumber;
        } else {
            number = number * firstNumber;
        }

        if (isUpperSecond) {
            number = number - secondNumber;
        } else {
            number = number + secondNumber;
        }

        return number;
    }

    private static int extractPosition(char character) {
        if (Character.isLowerCase(character)) {
            return Math.abs(96 - character);
        } else {
            return Math.abs(64 - character);
        }
    }
}
