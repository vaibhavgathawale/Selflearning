package NEW2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondElementInString {
    public static void main(String[] args) {

        String input = "Java practice is so treamendus";

        // Convert the string to a stream of characters and count occurrences
        Map<Character,Long> map = input.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        // Find the second non-repeating character
        Character firstNonRepitativeNumbers = map.entrySet().stream()
                .filter(entry -> entry.getValue()  ==1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElse(null);

        // Print the result
        System.out.println("secondNonRepitativeNumbers : "+firstNonRepitativeNumbers);



    }
}
