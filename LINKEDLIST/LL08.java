//Remove the tail of LL
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL08 {
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
    public static void removeLastnode(){ // This code is just for remove the last node from LL.
        if(head == null){
            System.out.println("can't remove anything because LL is already empty");
        }
        else if(head == tail){
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    //public static Node removeAndReturnLastnode(){     //This code is for remove and return the last node fron LL Line no. 77 to 80 also
      //  if(head == null){
      //      return null;
       // }
      //  else if(head == tail){
       //     Node var = tail;
        //    head = null;
        //    tail = null;
         //   return var;
       // }
       // else{
        //    Node temp = head;
         //   while(temp.next!=tail){
         //       temp = temp.next;
          //  }
          //  temp.next = null;
          //  Node var = tail;
          //  tail = temp;
          //  return var;
       // }
   // }
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
       // Node ans = removeAndReturnLastnode();
       // if(ans!=null){
            //System.out.println(ans.val);
       // }
        removeLastnode();
        print();
    }
}
