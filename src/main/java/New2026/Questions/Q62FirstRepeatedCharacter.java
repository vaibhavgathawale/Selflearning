package New2026.Questions;

import java.util.HashSet;
import java.util.Set;

public class Q62FirstRepeatedCharacter {
    public static void main(String[] args) {
        // String मधून first repeated character शोधा.

        String str = "swiss";

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.println(ch);
                break;
            }
        }

        System.out.println("========================== Second Way ===================================");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    return;
                }
            }
        }
    }
}
