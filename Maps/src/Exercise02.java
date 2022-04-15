import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while(!"stop".equals(item)){
            int quantity = Integer.parseInt(scan.nextLine());
            resources.putIfAbsent(item, 0);
            resources.put(item, resources.get(item) + quantity);

            item = scan.nextLine();
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
    }
}
