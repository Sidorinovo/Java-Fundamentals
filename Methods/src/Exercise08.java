import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Integer.parseInt(scan.nextLine());
        double second = Integer.parseInt(scan.nextLine());

        double firstFactorial = calculateFactorial(first);
        double secondFactorial = calculateFactorial(second);

        System.out.printf("%.2f", firstFactorial / secondFactorial);
    }

    private static double calculateFactorial(double num) {
        double result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        if (num == 0) {
            return 0;
        }
        return result;
    }
}
