import java.util.*;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> numbers = new TreeMap<>();

        for (int num : input) {
            if(!numbers.containsKey(num)){
                numbers.put(num, 0);
            }
            numbers.put(num, numbers.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.printf("%d -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
