package NEW2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumberFromList {
    public static void main(String[] args) {

        List<Integer> result = Arrays.asList(10,20,15,24,33,15,21,33);

        Set set = new HashSet<>();

        result.stream().filter(x -> !set.add(x)).forEach(System.out::println);


    }
}
