import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isTrue = true;

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if(leftSum == rightSum){
                System.out.println(i);
                isTrue = false;
                break;
            }

        }
        if (isTrue) {
            System.out.println("no");
        }
    }
}
