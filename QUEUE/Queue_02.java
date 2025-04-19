//Queue using LinkedList.(You have to implement Queue data structure using a LinkedList.)Refer portal.
//it means Queue banao linkedlist use karke...
package QUEUE;

import java.util.*;

class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class Queue_02 {
    static Node head;
    static Node tail;
    static int count = 0;
    public static void push(int val){       //1.Add a node in Queue(LL)
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
        count++;
    }
    public static int pop(){                 //2.Remove the element from queue(LL).
        if(head == null){
            tail = null;
            return -1;     //means LL is empty. 
        }
        int ans = head.val;
        head = head.next;
        count--;
        return ans;
    }
    public static int frontElement(){        //3.Return the element at front of queue.
        if(head == null){
            return -1;
        }
        return head.val;
    }
    public static int getSize(){             //4.Gives the current size of queue.
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Give input in this format 8: 1 1, 1 2 ,1 3, 1 4 , 3 2 3 4 (same as that of portal but in horizontal mannner).
        Queue_02 q1 = new Queue_02();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input == 1){
                int x = sc.nextInt();
                q1.push(x);
            }
            else if(input == 2){
                System.out.println(q1.pop());
            }
            else if(input == 3){
                System.out.println(frontElement());
            }
            else if(input == 4){
                System.out.println(getSize());
            }
        }
    }
}
