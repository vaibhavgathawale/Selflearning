package NEW2025;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementWithoutCount {
    public static void main(String[] args) {

        String str = "ASDFASDGHKLJNJ";

        Set<Character> seen = new HashSet<>();

        List<Character> duplicates = str.chars()                 // IntStream of characters
                .mapToObj(c -> (char) c)                             // Convert to Character stream
                .filter(c -> !seen.add(c))                           // If already seen, it's a duplicate
                .distinct()                                          // Remove repeated duplicates
                .collect(Collectors.toList());

        System.out.println("Duplicate characters: " + duplicates);
    }
}
