import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < arr.length - 1; i++) {
            int currentNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(currentNum + arr[j] == n){
                    System.out.println(currentNum + " " + arr[j]);
                }
            }
        }
    }
}
