import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while(!"end".equals(input)) {
            char[] arr = input.toCharArray();
            String output = reverseArray(arr);
            System.out.printf("%s = %s\n", input, output);
            input = scan.nextLine();
        }
    }

    private static String reverseArray(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char current = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = current;
        }
        return new String(arr);
    }
}
