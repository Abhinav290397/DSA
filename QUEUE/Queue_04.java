//Implement Queue using stack - Dequeue O(1).

/*Implement Queue using two stack S1 and S2. You need to complete the push and pop function 
of Queue class. You are given 2 types of query 1 for push an integer into queue and 2 for 
enqueue the value from the queue and print */

package QUEUE;
import java.util.*;
class QueueUsing2Stacks{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    //1.Pushing elements in stack.
    public void Push(int x){    //Pushing elements in this way has O(N) time complexity.
        while(st1.size() > 0){   //i)Move elements from st1 to st2.
            int top = st1.peek();
            st1.pop();
            st2.push(top);
        }

        st1.push(x);            //ii)Push current element in st1.

        while(st2.size() > 0){  //iii)Move back elements from st2 to st1.
            int top = st2.peek();
            st2.pop();
            st1.push(top);
        }
    }

    //2.poping elements from stack.
    public int Pop(){       //This Pop function have O(1)TC
        if(st1.size() == 0){
            return -1;
        }
        return st1.pop();
    }
}
public class Queue_04 {
    public static void main(String[] args) {  //Input code is copied from portal.
        Scanner sc = new Scanner(System.in);  
        QueueUsing2Stacks s = new QueueUsing2Stacks();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}
