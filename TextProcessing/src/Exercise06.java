import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        for (int i = input.length() - 1; i > 0; i--) {
            if (input.charAt(i) == input.charAt(i - 1)){
                input.deleteCharAt(i);
            }
        }

        System.out.println(input);
    }
}
