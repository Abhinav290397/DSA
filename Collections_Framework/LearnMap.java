package Collections_Framework;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {

        //1.Hastmap
        Map<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);

        System.out.println(hm);

        hm.put("three",95); //The value of key will override , if key is already exist.
        System.out.println(hm);

        //Iterating on Ma(p)
        for(String key:hm.keySet()){
            System.out.println(key);
        }
        for(Integer val : hm.values()){
            System.out.println(val);
        }

        //2.TreeMap
        Map<String,Integer>tm = new TreeMap(); //It puts key in sorted order.
        tm.put("one", 1);
        tm.put("two",2);
        tm.put("three",3);
        tm.put("four",4);
        tm.put("five",5);

        System.out.println(tm);

        tm.remove("three");
        System.out.println(tm);



    }
}
