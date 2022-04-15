import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printMiddleChar(input);
    }

    private static void printMiddleChar(String input) {
        String result = "";
        if (input.length() % 2 != 0) {
            int middle = input.length() / 2;
            result = String.valueOf(input.charAt(middle));
        } else {
            int middle = input.length() / 2;
            result = String.valueOf(input.charAt(middle - 1)) + String.valueOf(input.charAt(middle));;
        }

        System.out.println(result);
    }
}
