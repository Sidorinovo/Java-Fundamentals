import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        printResult(input);
    }

    private static void printResult(StringBuilder input) {

        int remainder = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                int explosion = Character.getNumericValue(input.charAt(i + 1)) + remainder;
                remainder = 0;

                switch (explosion) {
                    case 0:
                        break;
                    case 1:
                        input.deleteCharAt(i + 1);
                        break;
                    default:
                        while (i + 1 < input.length() && explosion > 0 && input.charAt(i + 1) != '>') {
                            input.deleteCharAt(i + 1);
                            explosion--;
                        }
                        if (i + 1 < input.length() && input.charAt(i + 1) == '>') {
                            remainder = explosion;
                        }
                        break;
                }
            }
        }
        System.out.println(input);
    }
}
