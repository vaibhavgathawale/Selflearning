package NEW2025;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramStringArray {
    public static void main(String[] args) {

        String[] str1 = {"java", "aavj", "abcd", "avaj", "cdba"};

        Map<String, List<String>> map = Arrays.stream(str1)
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        System.out.println(map.values());


    }
}
