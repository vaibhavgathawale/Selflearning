package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftZeroElement {
    public static void main(String[] args) {
        // This programme will demostrate shifting of 0 element in last of array.

        int[] numbers = {1, -2, 0, 4, 0, -1, -8, 0};

        List<Integer> result = Arrays.stream(numbers)
                .boxed()
                .filter(n -> n != 0)
                .collect(Collectors.toList());

        long zeroCount = Arrays.stream(numbers)
                .filter(n -> n == 0)
                .count();

        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }

        System.out.println(result); // Output: [1, -2, 4, -1, -8, 0, 0, 0]
    }
}
