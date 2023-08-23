package practice;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {
    
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }
    public Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton ss= new Singleton();
        String s1 = String.valueOf(ss.getInstance().hashCode());
        System.out.println(s1);
    }
}
