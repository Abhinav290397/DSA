//Reorder LL (Leetcode problem no.143)
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL19 {
    static Node head;
    static Node tail;
    public static void addAtLast(int val){
        Node nn = new Node(val);
        if(head==null){
            head = nn;
            tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
    }
    public static void reorderList(Node head){
        Node slow = head;   //1st find middle node of LL.
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; // Here we store middle node i.e slow in 'mid'.
        
        Node head2 = mid.next; //Now break the LL from middle node.
        mid.next = null;
       
        Node prev = null; //Now reverse the 2nd LL.
        Node curr = head2;
        while(curr!=null){
            Node store = curr.next;
            curr.next = prev;
            prev = curr;
            curr = store;
        }
        head2 = prev;

        Node dummy = new Node(-1); //From here we merge the both LL.
        Node temp = dummy;
        Node p1 = head;
        Node p2 = head2;
        while(p1!=null && p2!=null){
            Node stor1 = p1.next;
            p1.next = null;
            Node stor2 = p2.next;
            p2.next = null;
           
            temp.next = p1;
            p1 = stor1;
            temp = temp.next;

            temp.next = p2;
            p2 = stor2;
            temp = temp.next;
            if(p1==null){
                temp.next = p2;
            }
            if(p2==null){
                temp.next = p1;
            }
        }
        return;
    }
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
   public static void main(String[] args) {
    Scanner sc   = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        addAtLast(sc.nextInt());
    }
    reorderList(head);
    print();
   } 
}
