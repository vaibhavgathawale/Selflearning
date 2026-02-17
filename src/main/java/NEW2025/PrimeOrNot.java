package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeOrNot {
    public static void main(String[] args) {

        int[] arr = {9, 2, 4, 0, 5, 0, 1, 4, 6, 8};

        List<Integer> primes = Arrays.stream(arr)
                .filter(PrimeOrNot::isPrime)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Prime Numbers: " + primes);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
