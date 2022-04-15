import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = scan.nextLine();
            String value = scan.nextLine();
            if(!synonyms.containsKey(key)){
                synonyms.put(key, value);
            } else {
                synonyms.put(key, synonyms.get(key) + ", " + value);
            }
        }

        for (Map.Entry<String, String> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
