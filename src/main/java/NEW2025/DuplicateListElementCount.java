package NEW2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.*;
import java.util.stream.Collectors;


public class DuplicateListElementCount {
    public static void main(String[] args) {

        // Find duplicate elements without counting
        List<String> list = Arrays.asList("AAA","CCCC","ZZZ","PP","RR","PP");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = list.stream()
                .filter(s -> !seen.add(s))
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates);




          // Duplicate elements with count

       Map<String,Long> result = list.stream().filter(x -> Collections.frequency(list,x)>1)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(result);
        System.out.println("================================>");



    }
}
