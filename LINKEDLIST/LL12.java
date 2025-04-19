//segregate all the even and odd indexed elements such that odd indexed elements comes before evens.Consider indexing starts from 1.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL12 {
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
    public static void segregateOddEven(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node odd = dummy1;
        Node even = dummy2;
        int count = 1;
        Node temp  = head;
        while(temp!=null){
            Node storeNextOftemp = temp.next;
             temp.next = null;
            if(count%2!=0){    //means odd.
                odd.next = temp;
                temp = storeNextOftemp;
                odd = odd.next;
            }
            else{              //means even.
                even.next = temp;
                temp = storeNextOftemp;
                even = even.next;
            }
            count++;
        }
        Node oddHead = dummy1.next;
        Node evenHead = dummy2.next;
        odd.next = evenHead;
        return ;
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
        segregateOddEven(head);
        print();
    }
}
