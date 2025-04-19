//Stack is LIFO data structure.
package Collections_Framework;
import java.util.*;
public class LearnStack {
    public static void main(String[] args) {
        Stack<String>st1 = new Stack<>();
        
        st1.push("Dog");
        st1.push("Lion");
        st1.push("cat");
        st1.push("Cow");
        st1.push("Horse");

        System.out.println(st1);
        System.out.println(st1.peek());
        
        st1.pop();
        System.out.println(st1.peek());
    }
}
