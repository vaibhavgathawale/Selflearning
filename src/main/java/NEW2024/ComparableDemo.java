package NEW2024;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo implements Comparable<ComparableDemo>{

    // It will use for Single sorting also customize sorting. It will affect orignal object.


    int rollno;
    String name;
    int age;

    ComparableDemo(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        if(age == o.age){
            return  0;
        }else if(age>o.age){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<ComparableDemo> al=new ArrayList<ComparableDemo>();
        al.add(new ComparableDemo(101,"Vijay",23));
        al.add(new ComparableDemo(106,"Ajay",27));
        al.add(new ComparableDemo(105,"Jai",21));

        Collections.sort(al);
        for(ComparableDemo st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }

}
