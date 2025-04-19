//How to print a LL...Taking size and elements of LL from user and print it using a function.
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int x){
        val = x;
    }
}
public class LL04 {
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
 public static void printLL(){  //this function print the LL.
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
    printLL();
    }
}
