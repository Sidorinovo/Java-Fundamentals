import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int sumResult = sumFirstAndSecond(a, b);
        int subtractResult = subtractThirdFromResult(sumResult, c);
        System.out.println(subtractResult);
    }

    private static int sumFirstAndSecond(int a, int b){
        return a + b;
    }

    private static int subtractThirdFromResult(int sumResult, int c){
        return sumResult - c;
    }
}
