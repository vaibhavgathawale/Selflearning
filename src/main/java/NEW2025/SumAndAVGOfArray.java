package NEW2025;

import java.util.Arrays;

public class SumAndAVGOfArray {

    public static void main(String[] args) {

        int input[] ={10,25,12,14,36,21,5,1,55,21,52};

        int sum = Arrays.stream(input).sum();

        System.out.println(sum);


        // Avarage Of An Array
        Double avarage = Arrays.stream(input).average().getAsDouble();

        System.out.println(avarage);

    }
}
