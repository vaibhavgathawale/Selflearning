package Java8Practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindSecondHighestInterger {
    public static void main(String[] args) {

        int[] number ={1,2,6,0,6,44,32,232,4634,46,346,76};

        int result = Arrays.stream(number)
                .sorted()
                .skip(number.length -2)
                .findFirst()
                .getAsInt();

        System.out.println(result);

    }
}
