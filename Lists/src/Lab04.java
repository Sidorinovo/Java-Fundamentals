import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add ")) {
                addToList(list, command);
            } else if (command.contains("Remove ")) {
                removeFromList(list, command);
            } else if (command.contains("RemoveAt ")) {
                removeAtIndex(list, command);
            } else if (command.contains("Insert ")) {
                insertAtIndex(list, command);
            }

            command = scan.nextLine();
        }

        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void addToList (List<Integer> list, String command){
        //Add {number}: add a number to the end of the list
        int num = Integer.parseInt(new Scanner(command).nextLine().split("\\s+")[1]);
        list.add(num);
    }

    public static void removeFromList (List<Integer> list, String command){
        //Remove {number}: remove a number from the list
        int num = Integer.parseInt(new Scanner(command).nextLine().split("\\s+")[1]);
        list.remove(Integer.valueOf(num));
    }

    public static void removeAtIndex (List<Integer> list, String command){
        //RemoveAt {index}: remove a number at a given index
        int index = Integer.parseInt(new Scanner(command).nextLine().split("\\s+")[1]);
        list.remove(index);
    }

    public static void insertAtIndex (List<Integer> list, String command){
        //Insert {number} {index}: insert a number at a given index
        int num = Integer.parseInt(new Scanner(command).nextLine().split("\\s+")[1]);
        int index = Integer.parseInt(new Scanner(command).nextLine().split("\\s+")[2]);
        list.add(index, num);
    }
}
