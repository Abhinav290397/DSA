package Collections_Framework;
import java.util.*;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq = new ArrayDeque<>(); //ArrayDequeue is differ from Dequeue. ArrayDequeue has some extra functions.

        adq.offer(5);
        adq.offer(15);
        adq.offer(25);
        adq.offer(35);

        System.out.println(adq);

        adq.offerFirst(90);
        adq.offerLast(119);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
