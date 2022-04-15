package Exercise04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            String[] articleDetails = scan.nextLine().split(", ");
            String title = articleDetails[0];
            String content = articleDetails[1];
            String author = articleDetails[2];
            Article current = new Article(title, content, author);
            articles.add(current);
        }
        String sort = scan.nextLine();

        switch (sort) {
            case "title":
                articles.stream().sorted(Comparator.comparing(Article::getTitle)).forEach(System.out::println);
                break;
            case "content":
                articles.stream().sorted(Comparator.comparing(Article::getContent)).forEach(System.out::println);
                break;
            case "author":
                articles.stream().sorted(Comparator.comparing(Article::getAuthor)).forEach(System.out::println);
                break;
        }
    }
}
