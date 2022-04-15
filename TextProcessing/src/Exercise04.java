import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scan.nextLine());
        String input = builder.toString();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            current += 3;
            builder.replace(i, i + 1, String.valueOf(current));
        }

        System.out.println(builder);
    }
}
