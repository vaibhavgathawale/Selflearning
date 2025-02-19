package NEW2024;

import java.util.Arrays;
import java.util.List;

public class EvenOROdd {
    public static void main(String[] args) {
        List<Integer>ls = Arrays.asList(10,22,225,55,54,545);
        ls.stream().filter(x -> x%3==0)
                .forEach(System.out::println);
    }
}
