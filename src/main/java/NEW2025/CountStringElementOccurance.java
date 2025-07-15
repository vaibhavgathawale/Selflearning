package NEW2025;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountStringElementOccurance {
    public static void main(String[] args) {

        String abc = "abcdefa,abcdefa,abcdefa";

        Map<Character, Long> result = abc.chars().mapToObj(x -> (char) x).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(result);


    }
}
