package Lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        List<Student> students = new ArrayList<>();

        while (!"end".equals(command)) {
            String[] studentDetails = command.split("\\s+");

            String firstName = studentDetails[0];
            String lastName = studentDetails[1];
            int age = Integer.parseInt(studentDetails[2]);
            String homeTown = studentDetails[3];

            Student current = new Student(firstName, lastName, age, homeTown);
            boolean isExistent = isStudentExistent(students, current);
            if (!isExistent) {
                students.add(current);
            }
            command = scan.nextLine();
        }

        String homeTown = scan.nextLine();
        List<Student> filtered = students.stream().filter(e -> e.homeTown.equals(homeTown)).collect(Collectors.toList());
        for (Student student : filtered) {
            System.out.printf("%s %s is %d years old\n", student.firstName, student.lastName, student.age);
        }
    }

    public static boolean isStudentExistent(List<Student> students, Student current) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).firstName.equals(current.firstName) && students.get(i).lastName.equals(current.lastName)) {
                students.set(i, current);
                return true;
            }
        }
        return false;
    }
}
