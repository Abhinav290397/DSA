package Collections_Framework;
import java.util.*;
public class LearnArraylist {     
    public static void main(String[] args) {
        List<Integer>l1 = new ArrayList<>();
        //1.add function
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        l1.add(7);
        l1.add(9);
        System.out.println(l1);
        //2.This function adds an element at the given index of AL.
        l1.add(1,180);
        l1.add(3,250);
        System.out.println(l1);


        List<Integer>l2 = new ArrayList<>();
        l2.add(1024);
        l2.add(2525);

        //3.Adds all the elements of l2 to l1 AL.
        l1.addAll(l2); 
        System.out.println(l1);

        //4.get function,it gives the element of given index from AL.
        System.out.println(l1.get(3)); //gives element of 3rd index.

        //5.remove function.
        l1.remove(3);
        System.out.println(l1);

        //6.this will remove the given element from AL.
        l1.remove(Integer.valueOf(2525));
        System.out.println(l1);

        //7.this  function will delete all the elements from AL.
        l1.clear();
        System.out.println(l1);

        //* Time complexity of adding and removing an element is O(n).Because internally the for loop is working.
        
        //8.set function. (This function have TC of O(1).
         List<Integer>l3 = new ArrayList<>();
        l3.add(10);
        l3.add(20);
        l3.add(30);
        l3.add(40);
        l3.add(50);
        l3.add(60);

        System.out.println(l3);

        l3.set(2,7575);//This function will change/set the value at the given index with the value we are given.
        System.out.println(l3);

        //9.contains function.
        System.out.println(l3.contains(7575));
        System.out.println(l3.contains(89));

        //10.Iterating over a AL.
        //i)for loop.
        for (int i = 0; i < l3.size(); i++) {
            System.out.println("the element is :" + l3.get(i));
        }
        //ii)for-each loop.  Recommeded to use.
        for(Integer x:l3){
            System.out.println("element:"+x);
        }

        //iii).Iterator - iterator is used to iterate over the (AL).
        Iterator<Integer>it = l3.iterator();
        while(it.hasNext()){
            System.out.println("this is :"+it.next());
        }
    }
}
