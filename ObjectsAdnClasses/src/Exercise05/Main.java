package Exercise05;

import Exercise05.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] studentDetails = scan.nextLine().split("\\s+");
            String firstName = studentDetails[0];
            String lastName = studentDetails[1];
            double grade = Double.parseDouble(studentDetails[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students = students.stream().sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList());
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
