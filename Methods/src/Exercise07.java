import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        printMatrix(num);
    }

    private static void printMatrix(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
