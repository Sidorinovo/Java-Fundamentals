import java.util.*;
import java.util.stream.Collectors;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] courseInput = scan.nextLine().split(":");
        Map<String, List<String>> courseList = new LinkedHashMap<>();

        while (!"end".equals(courseInput[0])) {
            String course = courseInput[0].trim();
            String student = courseInput[1].trim();
            courseList.putIfAbsent(course, new ArrayList<>());
            List<String> current = courseList.get(course);
            current.add(student);
            courseList.put(course, current);

            courseInput = scan.nextLine().split(":");
        }

        for (Map.Entry<String, List<String>> entry : courseList.entrySet()) {
            Collections.sort(entry.getValue());
        }

        courseList.entrySet().stream().sorted((l, r) -> Integer.compare(r.getValue().size(), l.getValue().size())).forEach(e -> {
            System.out.printf("%s: %d\n", e.getKey(), e.getValue().size());
            List<String> current = e.getValue();
            printList(current);
        });

    }

    private static void printList(List<String> current) {
        for (int i = 0; i < current.size(); i++) {
            System.out.printf("-- %s\n", current.get(i));
        }
    }
}
