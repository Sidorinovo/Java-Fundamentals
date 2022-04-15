import java.math.BigInteger;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        BigInteger big = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= num; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }
}
