import java.math.BigInteger;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger num = new BigInteger(scan.nextLine());
        BigInteger num2 = new BigInteger(scan.nextLine());

        System.out.println(num.add(num2));
    }
}
