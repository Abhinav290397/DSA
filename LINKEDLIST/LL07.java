//Add a new node at the given index of LL.(refer intelliJ for more clearity)
package LINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class LL07 {
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
    
    public static void addAnodeAt(int idx,int value){
        if(idx ==0){
            Node nn = new Node(value);
            if(head==null){
            head = nn;
            tail = nn;
            }
            else{
                nn.next = head;
                head = nn;
            }
            //addAtFirst(value); //calling the above addAtFirst function.
            //return;
        }
        Node nn = new Node(value);
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        Node store = temp.next; //Creating connection with new node.
        temp.next = nn;
        nn.next = store;
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
        int idx = sc.nextInt();
        int value = sc.nextInt();
        for(int i=0;i<n;i++){
            addAtLast(sc.nextInt());
        }
        addAnodeAt(idx,value);
        print();

    }
}
