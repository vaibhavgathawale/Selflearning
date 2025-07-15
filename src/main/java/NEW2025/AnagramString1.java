package NEW2025;

import java.util.*;

public class AnagramString1 {
    public static void main(String[] args) {
        String[] str = {"java", "aavj", "abcd", "avaj", "cdba"};

        // Map to group anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : str) {
            // Convert to char array and sort it to form the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add to corresponding group
            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Print the anagram groups
        System.out.println("Anagram Groups: ");
        for (List<String> group : anagramGroups.values()) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}
