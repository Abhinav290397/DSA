package HASHING;
import java.util.*;
public class HM02Hashmap {
    public static void main(String[] args) {
         //Creation of HashMap.
         HashMap<String,Integer>hm = new HashMap<>();

         //2.Inserting value in HashMap.
         hm.put("India",135);
         hm.put("China",200);
         hm.put("USA",50);
         hm.put("Israel",20);
         hm.put("France",30);
        // System.out.println(hm);
 
         //3.Update the present entry.
         /*hm.put("India",150);
         hm.put("Canada",45);
         System.out.println(hm);
 
         //4.To get the value associated with key.
         System.out.println(hm.get("India"));
         System.out.println(hm.get("Nigeria"));//It will give the null value becoz it is not present in hashmap.
 
         //5.Key is present in hashmap or not.
         System.out.println(hm.containsKey("India"));
         System.out.println(hm.containsKey("Nigeria"));*/
 
          //6.Iterating over the HashMap to get value associated with key.
          for(String countries: hm.keySet()) {         //countries is a variable to iterate over key.
             System.out.println(hm.get(countries));
         }
         //7.hm.keySet()---> gives all the keys in hashmap
         System.out.println(hm.keySet());
 
         //8.Size of the hashmap.
         /*System.out.println(hm.size());*/



         //9.Linked HashMap.
         LinkedHashMap<Integer,Integer>lhm = new LinkedHashMap<>();

         /* If you need to maintain the insertion order while working with key-value pairs, 
         you should use LinkedHashMap. It preserves the order in which elements were inserted. */

         /*HashMap, on the other hand, does not guarantee any specific order of the elements. So, when the order
          of elements is important, it's better to use LinkedHashMap.
 */
    }
}
