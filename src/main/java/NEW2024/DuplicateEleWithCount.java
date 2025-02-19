package NEW2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEleWithCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AB","AB","cd","fd","df");

        Map<String,Long>result = names.stream()
                        .filter(x-> Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);
    }
}
