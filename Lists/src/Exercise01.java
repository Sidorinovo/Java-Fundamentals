import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scan.nextLine());
        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("end")) {

            if (command[0].equals("Add")) {
                int wagon = Integer.parseInt(command[1]);
                train.add(wagon);
            } else {
                int passengers = Integer.parseInt(command[0]);
                findSpaceInTrain(train, passengers, capacity);
            }

            command = scan.nextLine().split("\\s+");
        }
        System.out.println(train.toString().replaceAll("[\\[,\\]]", ""));
    }

    private static void findSpaceInTrain(List<Integer> train, int passengers, int capacity) {
        for (int i = 0; i < train.size(); i++) {
            if (capacity - train.get(i) >= passengers) {
                int newCapacity = train.get(i) + passengers;
                train.set(i, newCapacity);
                break;
            }
        }
    }
}
