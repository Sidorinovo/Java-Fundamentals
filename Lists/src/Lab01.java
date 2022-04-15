import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            double currentIndexNum = list.get(i);
            double nextIndexNum = list.get(i + 1);
            if (currentIndexNum == nextIndexNum) {
                list.set(i, currentIndexNum + nextIndexNum);
                list.remove(i + 1);
                i = -1;
            }
        }
        String output = listJoinedByDelimiter(list, " ");
        System.out.println(output);
    }

    private static String listJoinedByDelimiter(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("#.####");
        String output = "";
        for (int i = 0; i < list.size(); i++) {
            output = output.concat(df.format(list.get(i)));
            if (i < list.size() - 1) {
                output = output.concat(delimiter);
            }
        }

        return output;
    }
}
