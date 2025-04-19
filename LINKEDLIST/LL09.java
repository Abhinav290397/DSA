//Remove/Delete the node from given index/position from LL.(refer IntelliJ for more clearity).
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL09 {
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
    public static void deleteFromPos(int pos){
        if(pos==0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    //public static int getLength(){   // This function is find the length of LL only....not needed here just to understand-
       // Node temp = head;             //-how to find length of LL.
       // int len = 0;
       // while(temp!=null){
        //    temp = temp.next;
         //   len++;
       // }
       // return len;
   // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        for(int i=0;i<n;i++){
            addAtLast(sc.nextInt());
        }
        deleteFromPos(pos);
        print();
        //System.out.println(getLength());
    }
}
