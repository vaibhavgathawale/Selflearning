package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class FirstElementInList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long element = myList.stream().count();
        System.out.println("Count is : "+element);
    }

}
