package NEW2024;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceString8 {
    public static void main(String[] args) {

        String str = "Vaibhav Athawale";

        // Count occurrence of each character
        Map<Character, Long> charCount = str.chars() // returns IntStream
                .mapToObj(c -> (char) c) // convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        charCount.forEach((k, v) -> System.out.println(k + ": " + v));




    }
}
