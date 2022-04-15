import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commands = scan.nextLine().split("\\s+");

        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Contains":
                    int numToContain = Integer.parseInt(commands[1]);
                    printContains(numbers, numToContain);
                    break;
                case "Print":
                    String secondCommand = commands[1];
                    if (secondCommand.equals("even")) {
                        printEven(numbers);
                    } else if (secondCommand.equals("odd")) {
                        printOdd(numbers);
                    }
                    break;
                case "Get":
                    printSum(numbers);
                    break;
                case "Filter":
                    String condition = commands[1];
                    int conditionNumber = Integer.parseInt(commands[2]);
                    printConditionNumbers(condition, conditionNumber, numbers);
                    break;
            }

            commands = scan.nextLine().split("\\s+");
        }
    }

    private static void printConditionNumbers(String condition, int conditionNumber, List<Integer> numbers) {

        if(condition.equals("<")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) < conditionNumber){
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }

        if(condition.equals("<=")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) <= conditionNumber){
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }

        if(condition.equals(">")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) > conditionNumber){
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }

        if(condition.equals(">=")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) >= conditionNumber){
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }

    }

    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printOdd(List<Integer> numbers) {
        List<String> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(String.valueOf(number));
            }
        }
        System.out.println(String.join(" ", result));
    }

    private static void printEven(List<Integer> numbers) {
        List<String> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(String.valueOf(number));
            }
        }
        System.out.println(String.join(" ", result));
    }

    private static void printContains(List<Integer> numbers, int numToContain) {
        if (numbers.contains(numToContain)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
