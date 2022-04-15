import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        String first = input[0];
        String second = input[1];

        printSum(first, second);
    }

    public static void printSum(String first, String second){
        int sum = 0;
        int loopIterations = Math.min(first.length(), second.length());

        for (int i = 0; i < loopIterations; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        if(first.length() > second.length()){
            for (int i = loopIterations; i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = loopIterations; i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
