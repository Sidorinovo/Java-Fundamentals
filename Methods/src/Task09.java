import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scan.nextLine());
                int secondNum = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;

            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;

            case "string":
                String firstString = scan.nextLine();
                String secondString = scan.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }

    public static char getMax(char firstChar, char secondChar){
        return (char) Math.max(firstChar, secondChar);
    }

    private static String getMax(String firstString, String secondString) {
        if(firstString.compareTo(secondString) >= 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
