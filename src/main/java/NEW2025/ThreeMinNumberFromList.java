package NEW2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThreeMinNumberFromList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(17,20,23,1,25,41,2,5,22,27);

        list.stream().sorted().limit(3).forEach(System.out::println);


    }
}
