package New2026.TrickyQuestions;

public class Q7 {
    static int x;

    static {
        x = 15;
    }

    {
        x = 25;
    }
    public static void main(String[] args) {
        new Q7();
        System.out.println(x);

    }
}
