import java.util.*;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, List<String>> register = new TreeMap<>();

        while (!"Lumpawaroo".equals(input)) {
            addUser(register, input);
            input = scan.nextLine();
        }

        register.values().forEach(Collections::sort);
        register.entrySet().stream().sorted((l, r) -> r.getValue().size() - l.getValue().size()).forEach(e -> {
            if (!e.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
                for (int i = 0; i < e.getValue().size(); i++) {
                    System.out.printf("! %s\n", e.getValue().get(i));
                }
            }
        });
    }

    private static void addUser(Map<String, List<String>> register, String input) {

        String side = null;
        String user = null;

        if (input.contains(" | ")) {
            String[] details = input.split("\\|");
            side = details[0].trim();
            user = details[1].trim();
        } else if (input.contains(" -> ")) {
            String[] details = input.split("->");
            user = details[0].trim();
            side = details[1].trim();
        }

        for (Map.Entry<String, List<String>> entry : register.entrySet()) {
            entry.getValue().remove(user);
        }

        if (!register.containsKey(side)) {
            register.put(side, new ArrayList<>());
        }

        register.get(side).add(user);

        if (input.contains(" -> ")) {
            System.out.printf("%s joins the %s side!\n", user, side);
        }
    }
}

