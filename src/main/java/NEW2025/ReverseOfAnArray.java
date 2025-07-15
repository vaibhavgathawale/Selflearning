package NEW2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseOfAnArray {
    public static void main(String[] args) {


        int[] array = {10, 15, 2, 0, 2, 15, 42, 52, 6, 5, 55, 221, 55, 65};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        list.forEach(System.out::println);

    }
}
