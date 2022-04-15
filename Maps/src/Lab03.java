import java.util.*;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        Map<String, Integer> words = new LinkedHashMap<>();

        for (String word : input) {
            word = word.toLowerCase();
            if(!words.containsKey(word)){
                words.put(word, 0);
            }
            words.put(word, words.get(word) + 1);
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }

        System.out.println(result.toString().replaceAll("[\\[\\]]", ""));
    }
}
