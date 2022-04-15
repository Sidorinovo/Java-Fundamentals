import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        String output = repeatAndConcatenate(input);
        System.out.println(output);
    }

    private static String repeatAndConcatenate(String[] input) {
        String output = "";
        for (int i = 0; i < input.length; i++) {
            output = buildOutput(output, input[i]);
        }

        return output;
    }

    private static String buildOutput(String output, String input) {
        for (int i = 0; i < input.length(); i++) {
            output = output.concat(input);
        }
        return output;
    }
}
