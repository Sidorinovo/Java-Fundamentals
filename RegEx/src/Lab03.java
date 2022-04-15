import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b(?<day>\\d{2})([-./])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        String input = scan.nextLine();

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(input);

        while(mat.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n", mat.group("day"), mat.group("month"), mat.group("year"));
        }
    }
}
