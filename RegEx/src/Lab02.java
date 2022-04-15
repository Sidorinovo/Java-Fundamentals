import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);

        List<String> phoneNumbers = new ArrayList<>();

        while (match.find()) {
            phoneNumbers.add(match.group());
        }

        System.out.println(String.join(", ", phoneNumbers));
    }
}
