package NEW2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfList8 {
    public static void main(String[] args) {
        List<String>ls = Arrays.asList("A","B","C","D","A");
        Map<String,Long> result = ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
