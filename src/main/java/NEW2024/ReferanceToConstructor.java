package NEW2024;

public class ReferanceToConstructor {
    interface Messageable{
        Message getMessage(String msg);
    }
    static class Message{
        Message(String msg){
            System.out.print(msg);
        }
    }
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
