package NEW2024;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotDuplicateStingElement {
    public static void main(String[] args) {

        String str = "Vaibhav Athawale";

        // Count occurrence of each character
        Map<Character, Long> charCount = str.chars() // returns IntStream
                .mapToObj(c -> (char) c) // convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        // Filter characters that occur only once
        String nonDuplicateChars = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());

        // Print the result
        System.out.println("Non-duplicate characters: " + nonDuplicateChars);

    }
}
