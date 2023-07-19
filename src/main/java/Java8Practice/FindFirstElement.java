package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElement {
    public static void main(String[] args) {

        // Find out all the numbers starting with 1 using Stream functions?
        List<Integer> list = Arrays.asList(10,25,65,86,41,62,32,44,18,123);

        list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("------------------------1------------------------");

        // Find out all the element in string starting with 1 using Stream functions?
        List<String> names = Arrays.asList("Chris", "HTML", "XML", "CSS");

        names.stream().map(s -> s+"").filter(s -> s.startsWith("C")).forEach(System.out::println);
        System.out.println("------------------------2------------------------");

    }
}
