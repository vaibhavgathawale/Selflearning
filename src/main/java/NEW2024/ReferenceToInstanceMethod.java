package NEW2024;

public class ReferenceToInstanceMethod {

    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Thread t2=new Thread(ReferenceToInstanceMethod::ThreadStatus);
        t2.start();
    }
}
