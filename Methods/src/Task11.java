import java.text.DecimalFormat;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        double result = 0.0;

        switch (operator) {
            case "+":
                result = addNumbers(a, b);
                break;
            case "-":
                result = subtractNumbers(a, b);
                break;
            case "*":
                result = multiplyNumbers(a, b);
                break;
            case "/":
                result = divideNumbers(a, b);
                break;
        }

        System.out.println(new DecimalFormat("#.####").format(result));
    }

    private static double divideNumbers(int a, int b) {
        return 1.0 * a / b;
    }

    private static double multiplyNumbers(int a, int b) {
        return a * b;
    }

    private static double subtractNumbers(int a, int b) {
        return a - b;
    }

    private static double addNumbers(int a, int b) {
        return a + b;
    }
}
