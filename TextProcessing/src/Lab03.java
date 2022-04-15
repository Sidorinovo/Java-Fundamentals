import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String text = scan.nextLine();

        while ((text.contains(word))){
            text = text.replaceAll(word, "");
        }

        System.out.println(text);
    }
}
