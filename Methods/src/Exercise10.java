import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        //•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
        //•	Holds at least one odd digit, e.g. 232, 707, 87578.
        printTopNumber(num);
    }

    private static void printTopNumber(int num) {

        for (int i = 1; i <= num; i++) {
            if (containsOdd(i) && sumDivisibleByEight(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean containsOdd(int i) {
        while (i > 0) {
            int current = i % 10;
            if (current % 2 != 0) {
                return true;
            }
            i /= 10;
        }
        return false;
    }

    private static boolean sumDivisibleByEight(int i) {
        int sum = 0;
        while (i > 0) {
            sum += (i % 10);
            i /= 10;
        }
        return sum % 8 == 0;
    }
}
