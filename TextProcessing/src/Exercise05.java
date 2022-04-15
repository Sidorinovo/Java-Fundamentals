import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        int multiplier = Integer.parseInt(scan.nextLine());

        printResult(number, multiplier);
    }

    private static void printResult(String number, int multiplier) {
        StringBuilder result = new StringBuilder();
        int remainder = 0;

        if(multiplier == 0){
            System.out.println(0);
            return;
        }

        for (int i = number.length() - 1; i >= 0; i--) {
            int currentNumber = Character.getNumericValue(number.charAt(i));
            currentNumber = currentNumber * multiplier + remainder;
            remainder = currentNumber / 10;
            result.append(currentNumber % 10);
        }
        if (remainder > 0){
            result.append(remainder);
        }
        result.reverse();
        while(result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }
        System.out.println(result);
    }
}
