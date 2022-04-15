import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        printSmallestNumber(a, b, c);
    }

    private static void printSmallestNumber(int a, int b, int c) {
        int result = Integer.MAX_VALUE;
        if (a < result) {
            result = a;
        }
        if (b < result){
            result = b;
        }
        if (c < result){
            result = c;
        }
        System.out.println(result);
    }
}
