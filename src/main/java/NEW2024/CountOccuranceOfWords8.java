package NEW2024;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfWords8 {
    public static void main(String[] args) {

        String str = "Vaibhav Athawale Athawale";

        // Split the string into words and count occurrences of each word
        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+")) // Split by whitespace
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        wordCount.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
