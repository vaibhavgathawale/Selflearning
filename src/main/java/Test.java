import NEW2024.HighestSalaryOfFemaleEmp;
import NEW2025.Emp;
import New2026.Questions.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static int longestSubstring(String s, int k) {

        int freq[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right =0; right<s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch - 'A']);
            int windowsLength = right - left +1;
            int relacements = windowsLength - maxFreq;
            if(relacements > k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right - left +1);
            return maxLength;


        }




        return 1;
    }
    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;
        System.out.println(longestSubstring(s,k));
    }
}


