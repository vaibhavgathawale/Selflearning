package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceList {
    public static void main(String[] args) {

        List<String>list = Arrays.asList("AAA","BBB","CCC","DDD","AAA");

        Map<String,Long> result =list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);
    }
}
