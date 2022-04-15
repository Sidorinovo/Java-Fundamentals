import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
//("add", "multiply", "subtract", "divide")
        switch (command) {
            case "add":
                addNumbers(firstNum, secondNum);
                break;
            case "multiply":
                multiplyNumbers(firstNum, secondNum);
                break;
            case "subtract":
                subtractNumbers(firstNum, secondNum);
                break;
            case "divide":
                divideNumbers(firstNum, secondNum);
                break;
        }
    }

    private static void divideNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }

    private static void subtractNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    private static void multiplyNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    private static void addNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
