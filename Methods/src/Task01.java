import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printSign(num);
    }

    private static void printSign(int num) {
        String number = "zero";

        if (num > 0) {
            number = "positive";
        } else if (num < 0) {
            number = "negative";
        }

        System.out.printf("The number %d is %s.", num, number);
    }
}
