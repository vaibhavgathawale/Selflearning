package Java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        //Using StringBuffer
        String str = "ABCDEF";
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println("Rverse String is : "+stringBuffer);
        System.out.println("________________________1____________________________");

        //Using for loop
        String str1 = "ABCDEF";
        String reversedString  ="";
        for (int i=str1.length()-1;i>=0;i--){
            reversedString=reversedString+str1.charAt(i);
        }
        System.out.println("Rverse String is :"+reversedString);
        System.out.println("________________________2____________________________");


        //Using Stream API
        String str2 = "ABCDEF";
        int len = str2.length();
        IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j->str2.charAt(j))
                .forEach(System.out::print);



    }
}
