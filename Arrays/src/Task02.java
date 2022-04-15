import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrayOne = scan.nextLine().split("\\s+");
        String[] arrayTwo = scan.nextLine().split("\\s+");

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                if(arrayTwo[i].equals(arrayOne[j])){
                    System.out.print(arrayTwo[i] + " ");
                }
            }
        }
    }
}
