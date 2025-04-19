package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    
}

public class LL01 {
    public static void main(String[] args) {
        Node n = new Node();
        n.val  = 7;
        Node m = new Node();
        m.val = 9;
        n.next = m;// n.next means it contains the reference/address of next node i.e node m
        System.out.println(n.next);
        System.out.println(m);
    }
}
