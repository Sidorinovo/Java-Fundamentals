import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String digitRegex = "\\d";
        String letterRegex = "[A-Za-z]";

        Pattern digitPattern = Pattern.compile(digitRegex);
        Pattern letterPattern = Pattern.compile(letterRegex);

        List<String> participants = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input = scan.nextLine();
        Map<String, Integer> result = new LinkedHashMap<>();

        while(!"end of race".equals(input)){
            StringBuilder name = new StringBuilder();
            int kilometers = 0;

            Matcher digitMatch = digitPattern.matcher(input);
            Matcher letterMatch = letterPattern.matcher(input);

            while(letterMatch.find()){
                name.append(letterMatch.group());
            }

            if (participants.contains(name.toString())){
                result.putIfAbsent(name.toString(), 0);

                while(digitMatch.find()){
                    kilometers += Integer.parseInt(digitMatch.group());
                }

                result.put(name.toString(), result.get(name.toString()) + kilometers);
            }

            input = scan.nextLine();
        }

        List<String> places = new ArrayList<>(Arrays.asList("1st place: ", "2nd place: ", "3rd place: "));

        result.entrySet().stream().sorted((l, r) -> r.getValue().compareTo(l.getValue())).limit(3).forEach(e -> System.out.println(places.remove(0) + e.getKey()));
    }
}
