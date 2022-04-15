import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String, Map<String, Double>> listOfProducts = new LinkedHashMap<>();

        while (!"buy".equals(command)){
            String[] productDetails = command.split("\\s+");
            String product = productDetails[0];
            double price = Double.parseDouble(productDetails[1]);
            double quantity = Double.parseDouble(productDetails[2]);

            listOfProducts.putIfAbsent(product, new LinkedHashMap<>());
            listOfProducts.get(product).putIfAbsent("quantity", 0.0);
            listOfProducts.get(product).put("price", price);
            listOfProducts.get(product).put("quantity", listOfProducts.get(product).get("quantity") + quantity);

            command = scan.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : listOfProducts.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue().get("quantity") * entry.getValue().get("price"));
        }
    }
}
