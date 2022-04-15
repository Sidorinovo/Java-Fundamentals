import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandDetails = scan.nextLine().split("\\s+");
            String command = commandDetails[0];
            String name = commandDetails[1];

            switch (command) {
                case "register":
                    String licensePlate = commandDetails[2];
                    if (register.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", register.get(name));
                    } else {
                        register.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully\n", name, licensePlate);
                    }
                    break;
                case "unregister":
                    if (register.containsKey(name)) {
                        register.remove(name);
                        System.out.printf("%s unregistered successfully\n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found\n", name);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
