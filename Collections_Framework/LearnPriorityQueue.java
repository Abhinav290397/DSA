package Collections_Framework;
import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue<>(); //PQ's default implentation is of min. type.i.e small elment comes at top.    
        pq.offer(48);
        pq.offer(85);
        pq.offer(25);
        pq.offer(8);
        pq.offer(12);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        Queue Pq = new PriorityQueue<>(Comparator.reverseOrder()); //to implement max type PQ.
        Pq.offer(8);
        Pq.offer(5);
        Pq.offer(2);
        Pq.offer(11);
        Pq.offer(32);

        System.out.println(Pq);
        Pq.poll();
        System.out.println(Pq);
    }
}
