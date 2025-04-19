//Implement Queue using stack - enQueue O(1).

/* Implement Queue using two stack S1 and S2. You need to complete the push and 
pop function of Queue class. You are given 2 types of query 1 for push an 
integer into queue and 2 for enqueue the value from the queue and print.*/


package QUEUE;
import java.util.*;
class QueUsing2Stacks{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void Push(int x){ //TC = O(1).
        st1.push(x);
    }

    public int Pop(){         //TC = O(n).
        if(st1.size() == 0){
            return -1;
        }
        while(st1.size() > 1){
            int top = st1.peek();
            st1.pop();
            st2.push(top);
        }
        int ans = st1.peek();
        st1.pop();
        while(st2.size() > 0){
            int top = st2.peek();
            st2.pop();
            st1.push(top);
        }
        return ans;
    }
}
public class Queue_05 {
    public static void main(String[] args) {     //Input code is copied from portal.
        Scanner sc = new Scanner(System.in);  
        QueUsing2Stacks s = new QueUsing2Stacks();	
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
