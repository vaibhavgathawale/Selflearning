package practice;


import java.io.*;

public class Test implements Serializable{
    private String sessionId;
    private transient long lastAccessTime=5;

    public Test(String sessionId, long lastAccessTime) {
        this.sessionId = sessionId;
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public String toString() {
        return "Session ID: " + sessionId + ", Last Access Time: " + lastAccessTime;
    }
    public static void main(String[] args) {
        Test session = new Test("ABC123", 55);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("session.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("session.ser"))) {

            oos.writeObject(session);

            Test deserializedSession = (Test) ois.readObject();
            System.out.println("Deserialized Session: " + deserializedSession);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}