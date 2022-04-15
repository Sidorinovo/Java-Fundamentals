import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        checkPassword(password);
    }

    private static void checkPassword(String password) {
        boolean check1 = checkPassLength(password);
        boolean check2 = chekIfDigitsAndLettersOnly(password);
        boolean check3 = checkIfEnoughDigits(password);

        if(!check1){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!check2){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!check3){
            System.out.println("Password must have at least 2 digits");
        }

        if (check1 && check2 && check3) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkPassLength(String password) {
        if (password.length() >= 6){
            return true;
        }
        return false;
    }

    private static boolean chekIfDigitsAndLettersOnly(String password) {
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) < 48){
                return false;
            } else if(password.charAt(i) > 57 && password.charAt(i) < 65){
                return false;
            }else if (password.charAt(i) > 90 && password.charAt(i) < 97){
                return false;
            } else if(password.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfEnoughDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) > 47 && password.charAt(i) < 58){
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
