import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int result = multiplyOddByEven(num);
        System.out.println(result);
    }

    private static int multiplyOddByEven(int num) {
        int oddSum = 0;
        int evenSum = 0;
        while (num != 0) {
            int current = num % 10;
            num = num / 10;
            if (current % 2 != 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
        }

        return evenSum * oddSum;
    }
}
