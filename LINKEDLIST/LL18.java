//Reverse Alternate nodes in LL(refer GFG ) input:1 2 3 4 5 6 output:1 3 5 6 4 2
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL18 {
    static Node head;
    static Node tail;
    public static void addAtlast(int val){
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
    public static void rearrangeLL(Node head){
        int count = 0;          // break the given LL ninto 2-LLs 1 3 5 and 2 4 6
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node p1 = dummy1;
        Node p2 = dummy2;
        Node temp = head;
        while(temp!=null){
            Node store = temp.next;
            temp.next = null;
            if(count%2==0){
                p1.next = temp;
                temp = store;
                p1 = p1.next;
            }
            else{
                p2.next = temp;
                temp = store;
                p2 = p2.next;
            }
            count++;
        }
        Node ansHead1 = dummy1.next;
        Node ansHead2 = dummy2.next;
        Node prev = null;     // reverse the second LL as 2 4 6 --> 6 4 2 (without using reverse function)
        Node curr = ansHead2;
        while(curr!=null){
            Node stor = curr.next;
            curr.next = prev;
            prev = curr;
            curr = stor;
        }
        ansHead2 = prev;            
        p1.next = ansHead2;    //join last node of 1st LL  to first node od 2nd reversed LL.
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            addAtlast(sc.nextInt());
        }
        rearrangeLL(head);
        print();
    }
}
