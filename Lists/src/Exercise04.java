import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commandLine = scan.nextLine().split("\\s+");
        String command = commandLine[0];
        while (!"End".equals(command)) {

            switch (command) {
                case "Add":
                    int num = Integer.parseInt(commandLine[1]);
                    nums.add(num);
                    break;
                case "Insert":
                    num = Integer.parseInt(commandLine[1]);
                    int index = Integer.parseInt(commandLine[2]);
                    if(index < 0 || index > nums.size() - 1){
                        System.out.println("Invalid index");
                        break;
                    }
                    nums.add(index, num);
                    break;
                case "Remove":
                    index = Integer.parseInt(commandLine[1]);
                    if(index < 0 || index > nums.size() - 1){
                        System.out.println("Invalid index");
                        break;
                    }
                    nums.remove(index);
                    break;
                case "Shift":
                    String command2 = commandLine[1];
                    int repetitions = Integer.parseInt(commandLine[2]);
                    if ("left".equals(command2)) {
                        shiftLeft(nums, repetitions);
                    } else if ("right".equals(command2)) {
                        shiftRight(nums, repetitions);
                    }
                    break;
            }

            commandLine = scan.nextLine().split("\\s+");
            command = commandLine[0];
        }
        System.out.println(nums.toString().replaceAll("[\\[,\\]]", ""));
    }

    private static void shiftRight(List<Integer> nums, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            int last = nums.get(nums.size() - 1);
            nums.remove(nums.lastIndexOf(last));
            nums.add(0, last);
        }
    }

    private static void shiftLeft(List<Integer> nums, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            int first = nums.get(0);
            nums.remove(Integer.valueOf(first));
            nums.add(first);
        }
    }
}
