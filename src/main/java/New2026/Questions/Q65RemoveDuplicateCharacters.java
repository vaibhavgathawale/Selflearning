package New2026.Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q65RemoveDuplicateCharacters {
    public static void main(String[] args) {
        // String मधून duplicate characters remove करा.

        String str = "programming";
        Set <Character> set = new LinkedHashSet<>();

        for(Character ch : str.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);

        System.out.println("<================================= Using Java 8 Second Way  ===================================>");

        String str1 = "programming";

        Set<Character> st = new HashSet<>();
        for(Character ch1: str1.toCharArray()){
            st.add(ch1);
        }
        String result = st.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(result);
    }
}
