import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        String result = repeatString(num, input).toString();
        System.out.println(result);
    }

    public static StringBuilder repeatString(int num, String input){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(input);
        }
        return sb;
    }
}
