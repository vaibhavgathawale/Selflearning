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

        List<String> list = Arrays.asList("AAA","CCCC","ZZZ","PP","RR","PP");

       Map<String,Long> result = list.stream().filter(x -> Collections.frequency(list,x)>1)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(result);
    }
}
