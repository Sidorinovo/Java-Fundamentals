import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> firstList = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        mergeAndPrintLists(firstList, secondList);
    }

    public static void mergeAndPrintLists(List<Double> firstList, List<Double> secondList) {
        List<Double> convergence = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                convergence.add(firstList.get(i));
                convergence.add(secondList.get(i));
            }
            for (int i = secondList.size(); i < firstList.size(); i++) {
                convergence.add(firstList.get(i));
            }
        } else if (secondList.size() > firstList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                convergence.add(firstList.get(i));
                convergence.add(secondList.get(i));
            }
            for (int i = firstList.size(); i < secondList.size(); i++) {
                convergence.add(secondList.get(i));
            }
        } else {
            for (int i = 0; i < firstList.size(); i++) {
                convergence.add(firstList.get(i));
                convergence.add(secondList.get(i));
            }
        }
        printResultList(convergence);
    }

    public static void printResultList(List<Double> list) {
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(df.format(list.get(i)).concat(" "));
        }
        System.out.println();
    }
}
