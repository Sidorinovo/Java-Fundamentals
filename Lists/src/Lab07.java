import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        Collections.reverse(list);
        if(list.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(list.toString().replaceAll("[\\[,\\]]", ""));
        }
    }
}
