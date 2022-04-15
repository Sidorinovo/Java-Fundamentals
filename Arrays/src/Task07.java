import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int longestLength = 1;
        int currentLength = 1;
        int number = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];

            if (current == next) {
                currentLength++;
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    number = arr[i];
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < longestLength; i++) {
            System.out.print(number + " ");
        }
    }
}


