//Remove the first node of LL
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL05 {
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
    
   public static void removeFirstnode(){  //This function is used to remove head of a LL.
    if(head==null){
    System.out.println("can't remove because LL is already empty");
    }
    else if(head == tail){
        head = null;
        tail = null;
    }
    else{
        head = head.next;
    }
   }
    public static void printLL(){
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
   }

   public static void main(String[] args) {
    head = null;
    tail = null;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        addAtLast(sc.nextInt());
    }
   
    removeFirstnode();
    printLL();
   } 
}
