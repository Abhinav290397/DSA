//Return the node of LL when the user gives the index for that node.
package LINKEDLIST;
import java.util.*;
class Node{
      int val;
      Node next;
      public Node(int x){
        val = x;
      }
}
public class LL06 {
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
    public static Node getnode(int idx){ //This is the function to find the given index node value
        if(idx<0){
            System.out.println("Given index is out of range");
            return null ;
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            if(temp == null){          //this condition if to check if idx > LL size.
                System.out.println("Given index is out of range");
                return null;
            }
            temp = temp.next;
        }
        return temp;
       //System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            addAtLast(sc.nextInt());
        }
     //int idx = sc.nextInt();
        Node ans = getnode(2);
        System.out.println(ans.val);
        //getnode(n);
    }
}
