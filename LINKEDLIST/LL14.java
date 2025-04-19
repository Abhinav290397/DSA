//Reversing of  a LL.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL14 {
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
            tail =nn;
        }
    }
    public static void reverseLL(){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
        Node store  = temp.next;  //store reference temp.next in 'store' variable for further use..as used in line 31
        temp.next = prev;        //now points temp.next to previous node reference i.e 'prev'.
        prev = temp;   // move prev.
        temp = store;  //move temp.
        }
        head = prev;
        return;
    }
    public static void print(){
        Node temp = head;
        while(temp!= null){
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
        reverseLL();
        print();
    }
}
