package New2026.Questions;

public class FindTwoHighest {
    public static void main(String[] args) {

        int num[] = {5, 34, 78, 2, 45, 1, 99, 23};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : num) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }

        System.out.println("Highest: " + first);
        System.out.println("Second Highest: " + second);
    }
}
