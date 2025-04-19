package Collections_Framework;
import java.util.*;
public class LearnSet {
    public static void main(String[] args) {

        //1.HashSet
        Set<Integer>s1 = new HashSet<>();  //All operations perform in Hashset takes O(1) TC.//Set does not store identical elements,it stores only unique elements.
        
        s1.add(24); //Elements goes in hashset in a random order.
        s1.add(54);
        s1.add(85);
        s1.add(12);
        s1.add(23);

        System.out.println(s1);

        s1.remove(54);
        System.out.println(s1);

        System.out.println(s1.contains(23));
        System.out.println(s1.contains(95));
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());

        s1.clear();
        System.out.println(s1);

        //2.Linked HashSet.
        Set<Integer>set = new LinkedHashSet<>();

        set.add(24); //Elements goes in an order in LinkedHashSet
        set.add(54);
        set.add(85);
        set.add(12);
        set.add(23);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(23));
        System.out.println(set.contains(95));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);


        //3.TreeSet
        Set<Integer>tSet = new TreeSet<>();//All operations perform in Treeset takes O(log n) TC.
        tSet.add(24); //Elements goes in sorted order in TreeSet.
        tSet.add(54);
        tSet.add(85);
        tSet.add(12);
        tSet.add(23);

        System.out.println(tSet);

        tSet.remove(54);
        System.out.println(tSet);

        System.out.println(tSet.contains(23));
        System.out.println(tSet.contains(95));
        System.out.println(tSet.isEmpty());
        System.out.println(tSet.size());

        tSet.clear();
        System.out.println(tSet);
    }
}
