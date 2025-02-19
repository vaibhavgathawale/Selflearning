package NEW2024;

import org.json.JSONObject;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {



    public static void main(String[] args) {

        List list = new ArrayList<String>();
        list.add("C");
        list.add("B");
        list.add("A");
        list.add("B");
        list.add("B");
        list.removeAll(list);
        list.clear(); // o(n)
        System.out.println("Result of ArrayList : "+list);

        List list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(15);
        list2.add(95);
        list2.add(25);
        list2.add(85);
        System.out.println("Result of LinkedList : "+list2); //O Log(n)

        Vector vector = new Vector<>();
        vector.add("A");
        vector.add("F");
        vector.add("C");
        vector.add("G");
        vector.add("A");
        System.out.println("Result of Vector : "+vector);

        Stack list3 = new Stack(); //LIFO
        list3.add("D");
        list3.add("F");
        list3.add("E");
        list3.pop();
        list3.add("G");
        list3.push("");
        list3.push("");
        list3.add("D");
//        list3.pop();
        System.out.println("Result of STACK :" +list3);

        Deque d = new ArrayDeque(); //Two side element can add or remove
        d.add("A");
        d.add("B");
//        d.peek();
        d.add("C");
        d.pop();
        d.addFirst("Apple");
        d.addLast("Banana");
        System.out.println("Result of Deque : "+d);
// SET Interface
        Set set = new HashSet<String>(); // Internally follows Array for storing data
        set.add("D");
        set.add("B");
        set.add("C");
        set.add("");
        set.add("A");
        set.add("A");
        set.add("");
        System.out.println("Result of HashSet :"+set);

        Set uniqueSet = new HashSet<>(list);
        System.out.println("Unique Element " + uniqueSet);

        Set set2 = new LinkedHashSet();             // Internally follows Dubbly LinkedList Array for storing data
        set2.add("V");
        set2.add("");
        set2.add("C");
        set2.add("A");
        set2.add("E");
        set2.add("");


        System.out.println("Result of LinkedHashSet :" + set2);

        //

        SortedSet sortedSet = new TreeSet();
        sortedSet.add("D");
        sortedSet.add("B");
        sortedSet.add("A");
        System.out.println("Result Of Sorted Set :" +sortedSet);


        TreeSet treeSet = new TreeSet<>();  //
        treeSet.add(1000);      //Java 7    2 part peformance issue
        treeSet.add(1516);       // java 8 Red-Black Tree   (Binary Tree)
        treeSet.add(5156);
        treeSet.add(1515);
        treeSet.add(1651);
        treeSet.add(5456);
        System.out.println("Result of TreeSet :"+treeSet);

        //Map

        // 1.HashMap
        // 2. LinkedHashMap
        // 3. TreeMap

        Map map = new HashMap();  //Doesn't maintain any order
        map.put(10,"Ball");
        map.put(5,"Ap");
        map.put(6,"HEllo");
        map.put(4,"Yes");
        map.put(5,"BP");
        map.put(55,null);
        map.put(55,null);
        map.put(null,null);
        map.put(null,null);



        System.out.println("Result of Hashmap :"+map+ map.hashCode());

        Map map2 = new LinkedHashMap();   //Maintain insertion element
        map2.put(50,"F");
        map2.put(40,"B");
        map2.put(30,"G");
        map2.put(10,"B");
        map2.put(1,"A");
        System.out.println("Result of LinkedHashMap :"+map2);

        Map map3 = new TreeMap();    // Assending order follow by Key
        map3.put(55,"H");
        map3.put(44,"C");
        map3.put(33,"G");
        map3.put(101,"B");
        map3.put(12,"A");
        System.out.println("Result Of TreeMap :"+map3);

        Hashtable hashtable = new Hashtable();
        hashtable.put(55,"H");
        hashtable.put(44,"C");
        hashtable.put(33,"G");
        hashtable.put(101,"B");
        hashtable.put(12,"A");
       // hashtable.put(null,"ABC"); //Slower than Concurrenthashmap
        System.out.println("Result of Hashtable :"+hashtable);


        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(55,"H");
        concurrentHashMap.put(44,"C");   //Fast
        concurrentHashMap.put(33,"G");
        concurrentHashMap.put(101,"B");
        concurrentHashMap.put(12,"A");
        //concurrentHashMap.put(55,null);
        System.out.println("Result of concurrentHashMap :"+concurrentHashMap);


        // Java 8

        // Lambda Function

        int size = 10;






    }
}
