//Design Stack Using Linked List......Refer portal.
package QUEUE;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class stackUsingLL{
static Node head;
stackUsingLL(){
this.head = null;
}

//1.push elements in stack.
public static void push(int x){
   Node nn = new Node(x);
   if(head == null){
    head = nn;
   } 
   else{
    nn.next = head;
    head = nn;
   }
}

//2.peek..returns top value from stack.
public static int peek(){
    if(head == null){
        return -1;
    }
    return head.val;
}

//3.pop...removes element from top of stack.
public static void pop(){
    if(head == null){
        return;
    }
    head = head.next;
}

//4.print the items in stack.
public static Node display(){
    return head;
}
}

public class Queue_03 {
    public static void main(String[] args) {
        stackUsingLL l1 = new stackUsingLL(); //Input code is copied from portal.
		Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while(q-->0){
            int x;
            x = sc.nextInt();
            if(x==1){
                int y;
                y = sc.nextInt();
                l1.push(y);
            }
            if(x==2){
                System.out.println(l1.peek());
            }
            if(x==3){
                l1.pop();
            }
            if(x==4){
                Node temp = l1.display();
                while (temp != null) {

                    System.out.print(temp.val+" ");

                    temp = temp.next;
			    }
				System.out.println();
            }
        }
    }
}
