import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[] field = new int[size];
        String[] indexes = scan.nextLine().split("\\s+");

        for (int i = 0; i < indexes.length; i++) {
            int currentIndex = Integer.parseInt(indexes[i]);
            if (currentIndex >= 0 && currentIndex < field.length) {
                field[currentIndex] = 1;
            }
        }

        String command = scan.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");
            int startIndex = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            if (startIndex >= 0 && startIndex < field.length && field[startIndex] == 1) {
                switch (direction) {
                    case "right":
                        if (startIndex + distance < field.length && field[startIndex + distance] == 0) {
                            field[startIndex] = 0;
                            field[startIndex + distance] = 1;
                        } else if (startIndex + distance + distance < field.length) {
                            field[startIndex] = 0;
                            field[startIndex + distance + distance] = 1;
                        } else {
                            field[startIndex] = 0;
                        }

                        break;

                    case "left":
                        if (startIndex - distance >= 0 && field[startIndex - distance] == 0) {
                            field[startIndex] = 0;
                            field[startIndex - distance] = 1;
                        } else if (startIndex - distance - distance >= 0) {
                            field[startIndex] = 0;
                            field[startIndex - distance - distance] = 1;
                        } else {
                            field[startIndex] = 0;
                        }

                        break;
                }
            }

            command = scan.nextLine();
        }
        for (int f : field) {
            System.out.print(f + " ");
        }
    }
}
