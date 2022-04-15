import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int[] best = new int[n];
        int length = 0;
        int counter = 0;
        int startIndex = Integer.MAX_VALUE;
        int sum = 0;
        int bestCounter = 0;

        while (!command.equals("Clone them!")) {
            int[] current = Arrays.stream(command.split("!+")).mapToInt(Integer::parseInt).toArray();
            int bestStartIndex = Integer.MAX_VALUE;
            int bestLength = 1;
            int bestSum = current[current.length - 1];
            counter++;

            for (int i = 0; i < current.length - 1; i++) {
                bestSum += current[i];

                if (current[i] == 1 && current[i + 1] == 1) {
                    int currentStartIndex = i;
                    int currentLength = 1;

                    while ((current[i] == 1 && current[i + 1] == 1) && i < current.length - 2) {

                        currentLength++;
                        i++;
                        bestSum += current[i];
                    }
                    if (currentLength > bestLength) {
                        bestLength = currentLength;
                        bestStartIndex = currentStartIndex;
                    }
                }
            }


            if (bestLength > length) {
                length = bestLength;
                best = current;
                bestCounter = counter;
                sum = bestSum;
                startIndex = bestStartIndex;
            } else if (bestLength == length) {
                if (bestStartIndex < startIndex) {
                    startIndex = bestStartIndex;
                    best = current;
                    bestCounter = counter;
                    sum = bestSum;
                } else if (bestStartIndex == startIndex) {
                    if (bestSum > sum) {
                        startIndex = bestStartIndex;
                        best = current;
                        bestCounter = counter;
                        sum = bestSum;
                    }
                }
            }
            command = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCounter, sum);
        for (int i = 0; i < best.length; i++) {
            System.out.print(best[i] + " ");
        }
    }
}

