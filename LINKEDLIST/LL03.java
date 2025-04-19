//Add a node at the start(head) of the LL.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val =x;
    }
}
public class LL03 {
    static Node head;
    static Node tail;
    public static void addAtFirst(int val){
        Node nn = new Node(val);
        if(head==null){
            head = nn;
            tail = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
    }
    public static void main(String[] args) {
        head = null;
        tail = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
         addAtFirst(sc.nextInt());
        }
      
     System.out.println(head.val);
     System.out.println(tail.val);

    }
}
