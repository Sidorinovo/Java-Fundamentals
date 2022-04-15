import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printTriangle(num);
    }

    public static void printTriangle(int num) {
        printTopRows(num);
        printMiddleRow(num);
        printBottomRows(num);
    }

    public static void printTopRows(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printMiddleRow(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printBottomRows(int num) {
        for (int i = num - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
