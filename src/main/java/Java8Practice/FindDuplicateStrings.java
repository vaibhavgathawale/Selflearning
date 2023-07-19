package Java8Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateStrings {
    public static void main(String[] args) {

        // Findout Duplicate string elements
        List<String> list1 = Arrays.asList("Banana","Mango","Apple","Grapes","Apple","Banana");
        Set<String> stringSet = new HashSet<>();
        list1.stream()
                .filter(o1 -> !stringSet.add(o1))
                .forEach(System.out::println);

    }
}
