//Add a new node at the last(i.e tail) of LL.
package LINKEDLIST;
import java.util.*;

class Node{
    int val;
    Node next;
    Node(int x){
    val = x;
  }
}
public class LL02 {
    static Node head;
    static Node tail;
    public static void addAtLast(int val){ //This function is used to add a node at the last of LL.
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
        tail.next = nn;
        tail = nn;
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        addAtLast(sc.nextInt());
    }
    System.out.println(head.val);
    System.out.println(tail.val);
  }
 }
