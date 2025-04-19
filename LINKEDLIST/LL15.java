//Merge 2 sorted LL in a way such that the resultant LL also must be sorted.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL15 {
    static Node head1;
    static Node tail1;
    static Node head2;
    static Node tail2;
    public static void addAtLast1(int val){
        Node nn1 = new Node(val);
        if(head1==null){
            head1 = nn1;
            tail1 = nn1;
        }
        else{
            tail1.next = nn1;
            tail1 = nn1;
        }
    }
    public static void addAtLast2(int val){
        Node nn2 = new Node(val);
        if(head2==null){
            head2 = nn2;
            tail2 = nn2;
        }
        else{
            tail2.next = nn2;
            tail2 = nn2;
        }
    }
    public static void mergeLL(Node head1 ,Node head2){
        Node p1 = head1;
        Node p2 = head2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(p1!=null && p2!=null){
            Node store1 = p1.next;
            Node store2 = p2.next;
            if(p1.val < p2.val){
                curr.next = p1;
                p1 = store1;
            }
            else{
                curr.next = p2;
                p2 =store2;
            }
            curr = curr.next;
        }
        if(p1 ==null){
            curr.next =p2;
        }
        if(p2==null){
            curr.next = p1;
        }
        Node ansHead = dummy.next;
        return;
    }
    public static void print(){
        Node temp = head1;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            addAtLast1(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            addAtLast2(sc.nextInt());
        }
        mergeLL(head1, head2);
        print();
    }
}
