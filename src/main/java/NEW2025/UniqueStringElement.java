package NEW2025;

import java.util.stream.Collectors;

public class UniqueStringElement {
    public static void main(String[] args) {

        String str = "ABCBCADABC";

        String result = str.chars().distinct()
                .mapToObj(x -> String.valueOf((char)x))
                .collect(Collectors.joining());

        System.out.println(result);

    }
}
