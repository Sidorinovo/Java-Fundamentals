import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while((!firstDeck.isEmpty()) && (!secondDeck.isEmpty())){
            if (firstDeck.get(0) > secondDeck.get(0)){
                firstDeck.add(firstDeck.get(0));
                firstDeck.add(secondDeck.get(0));
                firstDeck.remove(0);
                secondDeck.remove(0);
            } else if (firstDeck.get(0) < secondDeck.get(0)){
                secondDeck.add(secondDeck.get(0));
                secondDeck.add(firstDeck.get(0));
                secondDeck.remove(0);
                firstDeck.remove(0);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }

        if (firstDeck.isEmpty()&& (!secondDeck.isEmpty())){
            int sum = Arrays.stream(secondDeck.toArray()).mapToInt(e -> (int)e).sum();
            System.out.printf("Second player wins! Sum: %d\n", sum);
        }else if (secondDeck.isEmpty() && (!firstDeck.isEmpty())){
            int sum = Arrays.stream(firstDeck.toArray()).mapToInt(e -> (int)e).sum();
            System.out.printf("First player wins! Sum: %d\n", sum);
        } else {
            System.out.println("You both loose!!!");
        }
    }
}
