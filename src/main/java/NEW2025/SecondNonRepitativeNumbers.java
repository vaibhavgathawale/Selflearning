package NEW2025;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepitativeNumbers {
    public static void main(String[] args) {

        String input = "Java practice is so treamendus";

        Map<Character,Long> result = input.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));


        Character character = result.entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(character);
    }
}
