package Exercise07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Person> people = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] personDetails = input.split("\\s+");
            Person person = new Person(personDetails[0], personDetails[1], Integer.parseInt(personDetails[2]));
            people.add(person);

            input = scan.nextLine();
        }

        people = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
