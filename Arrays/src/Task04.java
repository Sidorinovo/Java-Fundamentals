import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotation % arr.length; i++) {
            int tmp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = tmp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
