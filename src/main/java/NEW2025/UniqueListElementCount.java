package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueListElementCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("SS","AA","LL","LL","AA");

        Map<String,Long> result = list.stream().distinct()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(result);
    }
}
