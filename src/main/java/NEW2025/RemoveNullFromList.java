package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullFromList {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("Java", null, "", "Spring", null, "Kafka", "", null);

        // Only non-null strings
        List<String> result = input.stream()
                .filter(Objects::nonNull) // removes nulls
                .collect(Collectors.toList());

        System.out.println("Non-null strings: " + result);
    }
}
