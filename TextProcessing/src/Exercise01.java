import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(", ");
        List<String> validNames = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            boolean isValid = checkName(names[i]);
            if (isValid) {
                validNames.add(names[i]);
            }
        }
        for (String name : validNames) {
            System.out.println(name);
        }
    }

    public static boolean checkName(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != '-' && name.charAt(i) != '_') {

                return false;

            }
        }
        return true;
    }
}
