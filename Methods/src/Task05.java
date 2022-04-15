import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Write a method that calculates the total price of an order and prints it on the console.
        // The method should receive one of the following products: coffee, water, coke, snacks; and a quantity of the product.
        // The prices for a single piece of each product are:
        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00
        //Print the result rounded to the second decimal place.

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        printSum(product, quantity);
    }

    private static void printSum(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", 1.50 * quantity);
                break;
            case "water":
                System.out.printf("%.2f", 1.00 * quantity);
                break;
            case "coke":
                System.out.printf("%.2f", 1.40 * quantity);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.00 * quantity);
                break;
        }
    }
}
