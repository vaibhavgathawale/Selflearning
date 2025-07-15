package NEW2025;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class DuplicateElementInStringWithCount {

    public static void main(String[] args) {


        String str = "ASDFASDGHKLJNJ";

        Map<Character,Long> map = str.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        String abc = "abcdefa,abcdefa,abcdefa";

        Map<Character, Long> result = abc.chars().mapToObj(x -> (char) x).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(result);
    }


}
