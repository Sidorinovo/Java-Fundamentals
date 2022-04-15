import java.util.*;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();

        while (!"End".equals(input)) {
            String[] details = input.split("->");
            String company = details[0];
            String employee = details[1];
            companies.putIfAbsent(company, new ArrayList<>());
            if (!companies.get(company).contains(employee)) {
                companies.get(company).add(employee);
            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            //Collections.sort(entry.getValue());
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("--%s\n", entry.getValue().get(i));
            }
        }
    }
}
