package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommanElementInArray {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] arr2 = {5, 6, 7, 8, 9, 10};

        List<Integer> list2 = Arrays.asList(arr1);

        List<Integer> common = Arrays.stream(arr2)
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println("Common elements: " + common);
    }
}
