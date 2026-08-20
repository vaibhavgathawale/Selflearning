package New2026.Questions;

import java.util.HashSet;
import java.util.Set;

public class Q63FindDuplicateElements {
    public static void main(String[] args) {
          // Array मधून duplicate elements शोधा.

        int arr[] = {1, 2, 3, 2, 4, 3, 5};

        Set<Integer> set = new HashSet<>();
        for(Integer i : arr){
            if(!set.add(i)){
                System.out.println(i);
            }
        }
    }
}
