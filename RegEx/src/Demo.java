import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean isSimple = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                System.out.println("No");
                isSimple = false;
                break;
            }
        }
        if(isSimple){
            System.out.println("Yes");
        }
    }
}


