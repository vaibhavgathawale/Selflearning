package NEW2025;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestSalary {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int secondMax = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(null);
        System.out.println(secondMax);
    }
}
