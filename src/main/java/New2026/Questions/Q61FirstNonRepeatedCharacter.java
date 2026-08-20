package New2026.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q61FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        // दिलेल्या String मधून फक्त एकदाच येणारा पहिला character शोधा.

        String str = "swiss";

          Map<Character,Long> map = str.chars().mapToObj(i -> (char)i)
                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

          Character ch = map.entrySet()
                  .stream()
                  .filter(x -> x.getValue()==1)
                  .map(Map.Entry::getKey)
                  .findFirst()
                  .orElse(null);
        System.out.println(ch);

        System.out.println("<=============================== Second Way =============================================>");

        String str1 = "swiss";

        Map<Character, Integer> map1 = new HashMap<>();

        for (char ch1 : str1.toCharArray()) {
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
        }

        for (char ch1 : str1.toCharArray()) {
            if (map.get(ch1) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
