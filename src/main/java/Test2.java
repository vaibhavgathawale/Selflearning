import NEW2025.EmployeeSalary;

import java.util.*;


//public class Test2  {

//        Decode String
//
//        Input: s = "2[abc]3[cd]ef"
//
//        Output: "abcabccdcdcdef"
    //        Output :
//        abcd cdba
//        java aavj avaj


//
//        find all the pair of two element where sum = 9
//        Input: arr[] = {3, 6, 2, 4, 1, 5, 8, 7}
//        output = {3,6},{4,5},{7,2},{8,1},{6,2,1},{4,3,2}
//




//    Map<String, List<String>> anagramGroups = new HashMap<>();
//
//    String [] str = {"java", "aavj", "abcd", "avaj","cdba"};
//
//         for(String str1 : str ){
//        char[] chars = str1.toCharArray();
//        Arrays.sort(chars);
//        String string = new String(chars);

//             anagramGroups.computeIfAbsent(x -> new ArrayList<>())
//public static int ArrayChallenge(int[] arr) {
//    // __define-ocg__: Reverse logic – return 0 if subset exists, else 1
//
//    Arrays.sort(arr);
//    int target = arr[arr.length - 1]; // largest number
//
//    List<Integer> varFiltersCg = new ArrayList<>();
//    for (int i = 0; i < arr.length - 1; i++) {
//        varFiltersCg.add(arr[i]); // exclude largest
//    }
//
//    int[] varOcg = varFiltersCg.stream().mapToInt(i -> i).toArray();
//
//    // REVERSED: true → 0, false → 1
//    return canSum(varOcg, 0, 0, target) ? 0 : 1;
//}
//
//    private static boolean canSum(int[] nums, int index, int currentSum, int target) {
//        if (currentSum == target) {
//            return true;
//        }
//        if (index == nums.length) {
//            return false;
//        }
//
//        return canSum(nums, index + 1, currentSum + nums[index], target) ||
//                canSum(nums, index + 1, currentSum, target);
//    }
//
//    public static void main(String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();  // Example input: 4,6,23,10,1,3
//
//        // Convert string input to int[]
//        String[] tokens = input.split(",");
//        int[] arr = new int[tokens.length];
//        for (int i = 0; i < tokens.length; i++) {
//            arr[i] = Integer.parseInt(tokens[i].trim());
//        }
//
//        System.out.print(ArrayChallenge(arr));  // prints 0 if subset found, 1 otherwise
//    }

//}
