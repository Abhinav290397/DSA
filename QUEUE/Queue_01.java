//Queue is based on concept of FIFO(First In First Out) or LILO(Last In LAst Out).
package QUEUE;
import java.util.*;
public class Queue_01 {
    public static void main(String[] args) {
       
       //1.Initialization of queue.
        Queue<Integer>q1 = new LinkedList<>(); //Here Queue is interface & LinkedList is implementation of queue(means internally queue is implemented through LL)
       
       //2.Adding elements in queue.
        q1.add(58);
        q1.add(79);
        q1.add(96);
        q1.add(108);
        q1.add(497);
        System.out.println(q1);

        //3.get front element of queue.
        System.out.println(q1.peek());

        //4.Remove the elements from queue.
        q1.remove();
        System.out.println(q1);

        q1.remove();
        System.out.println(q1);

        //5.size of queue.
        System.out.println(q1.size());
    }
}
