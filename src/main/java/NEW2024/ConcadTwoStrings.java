package NEW2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcadTwoStrings {
    public static void main(String[] args) {
        List<String>ls1 = Arrays.asList("Hello","Java");
        List<String>ls2 =Arrays.asList("So","Simple","Language");
        Stream<String>concad = Stream.concat(ls1.stream(),ls2.stream());
        concad.forEach(System.out::println);
    }
}
