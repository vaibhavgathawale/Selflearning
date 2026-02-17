package NEW2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ThreeMaxNumberFromList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,50,60,40,32,15,20);

        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
