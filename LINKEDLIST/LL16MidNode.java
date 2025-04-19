//To find middle node in a LL...
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL16MidNode {
    static Node head;
    static Node tail;
    public static void addAtLast(int val){
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
    public static void findMiddle(Node head){
        if(head == null){
            return ;
        }
        else if(head.next==null){
            return;
        }
        //else{           // For even length LL ,this will give 2nd middle node..e.g for n=6-->1 2 3 4 5 6 this will return 4.
        // Node slow = head;
        // Node fast = head;
        //while(fast!=null && fast.next!=null){
        //    slow = slow.next;
        //    fast = fast.next.next;
        // }
         // System.out.println(slow.val);
       // }
        else{          //For even Length LL, this will give 1st middle node..e.g for n=6-->1 2 3 4 5 6 this will give 3.
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow  = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.val);
        }                         //But both conditions works good for odd numbered LL..use any condition for odd LL
    }
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
        addAtLast(sc.nextInt());
       }
       findMiddle(head);
    }
}
