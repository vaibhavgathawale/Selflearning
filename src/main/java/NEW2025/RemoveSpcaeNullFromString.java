package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveSpcaeNullFromString {
    public static void main(String[] args) {

        // This programme is removes duplicate and invalid from list

        List<String> names = Arrays.asList("john", "", null, "  ", "amyson");

        List<String> validNames = names.stream()
                .filter(Objects::nonNull)                  // remove null
                .filter(s -> !s.trim().isEmpty())          // remove empty and blank strings
                .collect(Collectors.toList());

        System.out.println("Valid names: " + validNames);


    }
}
