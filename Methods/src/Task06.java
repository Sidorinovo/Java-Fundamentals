import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sideA = Integer.parseInt(scan.nextLine());
        int sideB = Integer.parseInt(scan.nextLine());

        System.out.println(printArea(sideA, sideB));
    }

    public static int printArea(int sideA, int sideB) {
        return sideA * sideB;
    }
}
