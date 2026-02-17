package NEW2025;

import java.util.Arrays;

public class MissingNumberFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5; // Range 1 to 5

        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();

        System.out.println("Missing number: " + (expectedSum - actualSum));


    }
}
