package New2026.TrickyQuestions;


class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}

public class Q8 {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
