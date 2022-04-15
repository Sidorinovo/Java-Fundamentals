import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commands = scan.nextLine().split("\\s+");
        String command = commands[0];
        while (!command.equals("end")) {
            switch (command) {
                case "Delete":
                    int element = Integer.parseInt(commands[1]);
                    while (nums.contains(element)) {
                        nums.remove(Integer.valueOf(element));
                    }
                    break;
                case "Insert":
                    element = Integer.parseInt(commands[1]);
                    int position = Integer.parseInt(commands[2]);
                    nums.add(position, element);
                    break;
            }
            commands = scan.nextLine().split("\\s+");
            command = commands[0];
        }
        System.out.println(nums.toString().replaceAll("[\\[,\\]]", ""));
    }
}
