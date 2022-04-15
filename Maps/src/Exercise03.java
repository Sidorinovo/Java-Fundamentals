import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();

        keyMaterials.put("motes", 0);
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);

        Map<String, Integer> junk = new HashMap<>();
        boolean IsObtained = false;

        while (!IsObtained) {

            String[] resources = scan.nextLine().split("\\s+");

            for (int j = 0; j < resources.length; j += 2) {
                if (IsObtained) {
                    break;
                }

                int quantity = Integer.parseInt(resources[j]);
                String resource = resources[j + 1].toLowerCase();

                switch (resource) {

                    case "motes":
                        keyMaterials.put(resource, keyMaterials.get(resource) + quantity);
                        if (keyMaterials.get(resource) >= 250) {
                            keyMaterials.put(resource, keyMaterials.get(resource) - 250);
                            System.out.println("Dragonwrath obtained!");
                            IsObtained = true;
                        }
                        break;

                    case "shards":
                        keyMaterials.put(resource, keyMaterials.get(resource) + quantity);
                        if (keyMaterials.get(resource) >= 250) {
                            keyMaterials.put(resource, keyMaterials.get(resource) - 250);
                            System.out.println("Shadowmourne obtained!");
                            IsObtained = true;
                        }
                        break;

                    case "fragments":
                        keyMaterials.put(resource, keyMaterials.get(resource) + quantity);
                        if (keyMaterials.get(resource) >= 250) {
                            keyMaterials.put(resource, keyMaterials.get(resource) - 250);
                            System.out.println("Valanyr obtained!");
                            IsObtained = true;
                        }
                        break;

                    default:
                        junk.putIfAbsent(resource, 0);
                        junk.put(resource, junk.get(resource) + quantity);
                        break;
                }
            }
        }

        keyMaterials.entrySet().stream().sorted((l, r) -> {
            int res = r.getValue() - l.getValue();
            if (res == 0) {
                res = l.getKey().compareTo(r.getKey());
            }
            return res;
        }).forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

        junk.entrySet().stream().sorted((l, r) -> l.getKey().compareTo(r.getKey())).forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }
}
