package Stacks;
import java.util.*;
public class Stack01 {
    public static void main(String[] args) {
        //1.Creation of stack.
        Stack<Integer>st1 = new Stack<>();

        //2.Adding an element in stack.
        st1.push(5); // Bottom most element in stack as inserted first
        st1.push(9);
        st1.push(7); // Top most element in stack as it inserted last.
        System.out.println(st1);
         
        //3.To point the 1st element in stack we use st1.peek().
        System.out.println(st1.peek());

        //4.To find size of stack.
        System.out.println(st1.size());
        
        st1.pop(); //It delete and returns the top element.

        System.out.println(st1);
        System.out.println(st1.size());
        
        //If pop and peek function used in empty stack then it will give empty stack exception(i.e runtime error)
        // st1.pop() and st1.peek() used only when st1.size() > 0.

        //5.To remove all elements from stack.
        while(st1.size()>0){
            System.out.println(st1.pop());
        }
        //6.sum of all elements in stack.
        int sum = 0;
        while(st1.size()> 0){
            sum = sum + st1.pop();
        }
    }
}

