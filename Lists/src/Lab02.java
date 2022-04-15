import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        printList(gaussTrick(list), list);
    }

    public static List<Double> gaussTrick(List<Double> list){
        List<Double> current = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            double currentNum = list.get(i) + list.get(list.size() - 1 - i);
            current.add(currentNum);
        }
        return current;
    }

    public static void printList(List<Double> current, List<Double> list) {
        DecimalFormat df = new DecimalFormat("#.####");

        for (Double aDouble : current) {
            System.out.print(df.format(aDouble) + " ");
        }

        if (list.size() % 2 != 0) {
            System.out.println(df.format(list.get(list.size() / 2)));
        }
    }
}
