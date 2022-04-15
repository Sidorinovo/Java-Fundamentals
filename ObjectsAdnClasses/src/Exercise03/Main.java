package Exercise03;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            String[] personDetails = scan.nextLine().split("\\s+");
            String name = personDetails[0];
            int age = Integer.parseInt(personDetails[1]);
            Person person = new Person(name, age);
            people.add(person);
        }

        List<Person> filtered = people.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
        filtered = filtered.stream().sorted((l, r) -> (l.getName().compareTo(r.getName()))).collect(Collectors.toList());
        for (Person person : filtered) {
            System.out.println(person);
        }
    }
}
