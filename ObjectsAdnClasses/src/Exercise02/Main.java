package Exercise02;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] articleDetails = scan.nextLine().split(", ");
        String title = articleDetails[0];
        String content = articleDetails[1];
        String author = articleDetails[2];
        Article article = new Article(title, content, author);

        int num = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < num; i++) {
            String[] commandLine = scan.nextLine().split(": ");
            String command = commandLine[0];
            String stuffing = commandLine[1];

            switch (command) {
                case "Edit":
                    article.edit(stuffing);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(stuffing);
                    break;
                case "Rename":
                    article.rename(stuffing);
                    break;
            }
        }
        System.out.println(article);
    }
}
