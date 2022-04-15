import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        printResult(grade);
    }

    public static void printResult(double grade) {
        String result = "";
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"
        if (grade >= 2.00 && grade < 3.00) {
            result = "Fail";
        } else if (grade < 3.50) {
            result = "Poor";
        } else if (grade < 4.50) {
            result = "Good";
        } else if (grade < 5.50) {
            result = "Very good";
        } else if (grade <= 6.00) {
            result = "Excellent";
        }
        System.out.println(result);
    }
}
