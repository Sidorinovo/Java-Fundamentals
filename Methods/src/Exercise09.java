import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while(!input.equals("END")){
            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reverse += input.charAt(i);
            }
            if(reverse.equals(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scan.nextLine();
        }
    }
}
