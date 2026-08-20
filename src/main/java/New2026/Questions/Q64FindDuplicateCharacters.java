package New2026.Questions;

import java.util.HashSet;
import java.util.Set;

public class Q64FindDuplicateCharacters {
    public static void main(String[] args) {
            // String मधून duplicate characters शोधा.

        String str = "programming";
        Set<Character> set = new HashSet<>();

        str.chars().mapToObj(c -> (char) c).filter(c -> !set.add(c)).distinct()
                .forEach(System.out::println);

    }
}
