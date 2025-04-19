//Basics of HashSet.
package HASHSET;
import java.util.*;
public class hs01 {
  public static void main(String[] args) {
    //1.Creation of HashSet.
    HashSet<Integer> hs = new HashSet<Integer>();

    //2.Insert element in hashset.
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(4);
    hs.add(1);
    hs.add(4);
    System.out.println(hs);

    //3.size of hashset
    System.out.println(hs.size());

    //4.searching an element in set.
    if(hs.contains(1))System.out.println("yes");
    if(!hs.contains(6))System.out.println("no");

    //5.delete from set.
    hs.remove(2);
    System.out.println(hs);

    //6.Iterator in set / traverse on set
    Iterator it = hs.iterator(); 
    //a. it.next() function, it returns the values from set one by one.
    System.out.println(it.next()); //
    System.out.println(it.next());

    //b.  it.hasNext() function it returns true if there exists next value in hs otherwise false.
    while(it.hasNext()){
        System.out.println(it.next());
    }
  }  
}
