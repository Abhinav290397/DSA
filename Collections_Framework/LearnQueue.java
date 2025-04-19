package Collections_Framework;
import java.util.*;
public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer>q1 = new LinkedList<>(); //This is becoz Queue interface is implemented by linkedlist class.
        q1.add(10);  //q1.offer(10) //.add is sometime dangerous...refer to use .offer function.
        q1.add(20);
        q1.add(30);

        System.out.println(q1);
        System.out.println(q1.remove());  //Instead of q1.remove(), refer to use q1.poll() becoz it is much safer.(poll return the null, if the queue is empty,while remove gives the exception which lead to crash of app.)
        System.out.println(q1);
        System.out.println(q1.peek());
    }
}
