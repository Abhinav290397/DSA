//Segregate all odd and even elements such that even elements comes before odds and their relative ordering should be maintainted.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL13 {
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
    if(head==null || head.next==null){
        return;
    }
    Node dummy1 = new Node(-1);
    Node dummy2 = new Node(-1);
    Node even = dummy1;
    Node odd = dummy2;
    Node temp = head;
    while(temp!=null){
        Node store = temp.next; //Here we store the reference temp.next in 'store' variable becoz in next step we are going to make temp.next to be null.-Becoz in further steps if we needed temp.next we take it from store variable as we do in 39th line
        temp.next = null;        
        if(temp.val%2!=0){
            odd.next = temp;
            temp = store;
            odd = odd.next;
        }
        else{
            even.next = temp;
            temp = store;
            even = even.next;
        }
    }
    Node evenHead = dummy1.next;
    Node oddHead = dummy2.next; //to be reviewed
    odd.next = evenHead;
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
        segregateOddEven(head);
        print();
    }
}
