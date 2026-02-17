package New2026.TrickyQuestions;

public class Q11 {
    static {
        System.out.println("Static");
    }

    {
        System.out.println("Instance");
    }

    Q11() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
           new Q11();
    }
}
