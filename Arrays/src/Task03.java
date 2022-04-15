import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            int[] temp = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                first[i] = temp[0];
                second[i] = temp[1];
            } else {
                first[i] = temp[1];
                second[i] = temp[0];
            }
        }
        for (int i : first) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : second) {
            System.out.print(i + " ");
        }
    }
}
