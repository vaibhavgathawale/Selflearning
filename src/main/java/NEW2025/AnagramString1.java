package NEW2025;

import java.util.*;

public class AnagramString1 {
    public static void main(String[] args) {

        String[] str1 = {"java", "aavj", "abcd", "avaj", "cdba"};

        Map<String,List<String>> anagramGroups1 = new HashMap<>();

        for(String loop : str1 ){
            char[] chars = loop.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagramGroups1.computeIfAbsent(key, k -> new ArrayList<>()).add(loop);
        }



        // By Second way also we can do it.
        System.out.println("---------------------------------------------------------->");

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
