package NEW2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementInString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("G","D","F","S","D","F");
        Set uniqueList = new HashSet<>();
        list.stream()
                .filter(x -> uniqueList.add(x))
                .forEach(System.out::println);
        System.out.println("------------------------1---------------------------");

    }
}
