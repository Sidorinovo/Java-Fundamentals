import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numOfCommands; i++) {
            String[] commands = scan.nextLine().split("\\s+");
            String name = commands[0];

            if (commands.length == 3 && guests.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
            } else if(commands.length == 3) {
                guests.add(name);
            } else if (commands.length == 4 && guests.contains(name)){
                guests.remove(name);
            } else {
                System.out.printf("%s is not in the list!\n", name);
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
