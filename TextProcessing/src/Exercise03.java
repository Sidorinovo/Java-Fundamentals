import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\\\");
        String[] fileInfo = input[input.length - 1].split("\\.");

        String filename = fileInfo[0];
        String extension = fileInfo[1];

        System.out.printf("File name: %s\nFile extension: %s\n", filename, extension);
    }
}
