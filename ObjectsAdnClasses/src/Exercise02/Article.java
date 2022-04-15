package Exercise02;

public class Article {
    public String title;
    public String content;
    public String author;

    public String getTitle() {
        return title;
    }

    public void rename(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void edit(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Article() {
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.getAuthor());
    }
}
