import java.util.*;
import java.util.stream.Collectors;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfProducts = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < numOfProducts; i++) {
            String product = scan.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (String product : products) {
            System.out.printf("%d.%s%n", products.indexOf(product) + 1, product);
        }

    }
}
