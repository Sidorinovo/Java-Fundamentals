import java.text.DecimalFormat;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        double result = powerOfGivenNum(num, power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double powerOfGivenNum(double num, int power){
        return Math.pow(num, power);
    }
}
