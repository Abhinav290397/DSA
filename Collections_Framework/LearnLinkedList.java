package Collections_Framework;
import java.util.*;
public class LearnLinkedList {
    public static void main(String[] args) {
        List<Integer>l1 = new LinkedList<>(); //This LL class is exactly same as that of AL class.
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        l1.add(7);
        l1.add(9);
        System.out.println(l1);
        //2.This function adds an element at the given index of LL.
        l1.add(1,180);
        l1.add(3,250);
        System.out.println(l1);


        List<Integer>l2 = new LinkedList<>();
        l2.add(1024);
        l2.add(2525);

        //3.Adds all the elements of l2 to l1 LL.
        l1.addAll(l2); 
        System.out.println(l1);

        //4.get function,it gives the element of given index from LL.
        System.out.println(l1.get(3)); //gives element of 3rd index.

        //5.remove function.
        l1.remove(3);
        System.out.println(l1);

        //6.this will remove the given element from LL.
        l1.remove(Integer.valueOf(2525));
        System.out.println(l1);

        //7.this  function will delete all the elements from LL.
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

    }
}
