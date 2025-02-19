package NEW2024;

import java.util.Arrays;
import java.util.List;

public class FistElementInArray {
    public static void main(String[] args) {

        List<Integer>ls = Arrays.asList(10,55,14,88,65,10,55);

        ls.stream()
                .map(s -> s+ "")
                .filter(s->s.startsWith(String.valueOf(5)))
                .forEach(System.out::println);
    }
}
