package NEW2025;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepitativeElementString {
    public static void main(String[] args) {

        String input = "Java practice is so treamendus";

        Map<Character,Long> map = input.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));


        Character character = map.entrySet().stream().filter(x -> x.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(character);
    }
}
