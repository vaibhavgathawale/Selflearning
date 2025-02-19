package NEW2024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
    public static void main(String[] args) {

        List<Integer>ls = Arrays.asList(10,56,41,20,20,41);
        Set set = new HashSet<>();

        ls.stream()
                .filter(x -> !set.add(x))
                .forEach(System.out::println);
      

        
    }
}
