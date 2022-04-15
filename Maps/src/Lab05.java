import java.util.Arrays;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).sorted((l, r) -> r.compareTo(l)).limit(3).forEach(e -> System.out.print(e + " "));
    }
}
