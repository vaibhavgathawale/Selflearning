package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 7, 15, 43, 94, 77, 62, 32, 16);
        List<Integer> result = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());

        System.out.println(result);
    }
}
