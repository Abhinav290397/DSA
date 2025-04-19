// To find the middle node of LL and return that middle node.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL10 {
    static Node head;
    static Node tail;
    public static void addAtLast(int val){
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
            tail.next= nn;
            tail = nn;
        }
    }
   //  public static int getSize(Node head){ //This is just a function to find length of LL..not at all required in this ques. ..just written
     //   int len = 0;
     //   Node temp = head;
      //  while(temp!=null){
       //     temp = temp.next;
       //     len++;
     //   }
      //  return len;
    //}
    public static void getMiddlenode(Node head){   // this function only finds the middle node not delete it.
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //return slow;            // if we take 'Node' as function type for this function then we should use return..but we want to print middle node 
        System.out.println(slow.val);              // this is becoz when fast= null or fast.next = null..slow will stand on middle node.
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
        getMiddlenode(head);  
    }
}
