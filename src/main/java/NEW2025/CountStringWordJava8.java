package NEW2025;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringWordJava8 {
    public static void main(String[] args) {

        String abc = "Vaibhav is a Vaibhav";

        Map<String, Long> result = Arrays.stream(abc.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);

        // If we want all result in lower case that time you need to add abc.toLoweCase().split("")

        Map<String, Long> woCount = Arrays.stream(abc.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(woCount);

    }
}
