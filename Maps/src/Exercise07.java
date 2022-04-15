import java.util.*;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> listOfStudents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scan.nextLine();
            Double grade = Double.parseDouble(scan.nextLine());
            listOfStudents.putIfAbsent(student, new ArrayList<>());
            List<Double> grades = listOfStudents.get(student);
            grades.add(grade);
        }

        Map<String, Double> finalList = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : listOfStudents.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            if(avg >= 4.5){
                finalList.put(entry.getKey(), avg);
            }
        }

        finalList.entrySet().stream().sorted((l, r) -> r.getValue().compareTo(l.getValue())).forEach(e -> System.out.printf("%s -> %.2f\n",e.getKey(), e.getValue()));
    }
}
