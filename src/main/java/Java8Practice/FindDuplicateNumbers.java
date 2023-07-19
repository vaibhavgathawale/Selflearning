package Java8Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        // Findout Duplicate Elements
        List<Integer>list = Arrays.asList(10,25,63,15,85,46,75,92,12,10,54,45,85);
        Set set = new HashSet<>();
        list.stream()
                .filter(s -> !set.add(s))
                .forEach(System.out::println);
        System.out.println("------------------------1---------------------------");



    }
}
