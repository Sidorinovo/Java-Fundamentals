import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombDetails = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombNumber = bombDetails[0];
        int bombPower = bombDetails[1];

        while (nums.contains(bombNumber)){
            int index = nums.indexOf(bombNumber);
            int leftBound = Math.max(0, index - bombPower);
            int rightBound = Math.min(nums.size() - 1, index + bombPower);
            for (int i = rightBound; i >= leftBound; i--) {
                nums.remove(i);
            }
        }

        //System.out.println(nums.toString().replaceAll("[\\[, \\]]", ""));
        int sum = Arrays.stream(nums.toArray()).mapToInt(e -> (int)e).sum();
        System.out.println(sum);
    }

    private static void detonate(int index, int bombPower, List<Integer> nums) {
        if(nums.size() - 1 - index >= bombPower){
            for (int i = 0; i <= bombPower; i++) {
                nums.remove(index);
            }
        } else {
            while (index < nums.size()) {
                nums.remove(index);
            }
        }
        if(index-bombPower >= 0){
            for (int i = index - 1; i >= index-bombPower; i--) {
                nums.remove(i);
            }
        } else {
            for (int i = 0; i < bombPower - index; i++) {
                nums.remove(0);
            }
        }
    }
}
