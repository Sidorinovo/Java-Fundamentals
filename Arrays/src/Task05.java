import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            boolean isTop = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (tmp <= arr[j]) {
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(tmp + " ");
            }
        }
    }
}
