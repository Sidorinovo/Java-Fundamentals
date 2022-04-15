import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(java.lang.System.in);

        String regex = ">>(?<name>\\w+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        List<String> purchases = new ArrayList<>();
        double totalPrice = 0.0;

        while (!"Purchase".equals(input)){
            Matcher matcher = pattern.matcher(input);

            while(matcher.find()){
                purchases.add(matcher.group("name"));
                totalPrice += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String purchase : purchases) {
            System.out.println(purchase);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
