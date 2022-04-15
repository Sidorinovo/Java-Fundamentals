import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        printCharactersBetween(first, second);
    }

    private static void printCharactersBetween(char first, char second) {
        if (first < second) {
            for (int i = first + 1; i < second; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = second + 1; i < first; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
