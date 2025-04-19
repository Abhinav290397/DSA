//To find middle node of LL and then delete that middle node from LL.
package LINKEDLIST;
import java.util.*;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL11 {
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
    public static void deletemid(Node head){
        if(head==null){
            return ;
        }
        if(head.next==null){
           return ;
        }
         Node prev = null;
         Node slow = head;
         Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow  =  slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
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
            addAtLast(sc.nextInt());
        }
        deletemid(head);
        print();
    }
    
}

   
