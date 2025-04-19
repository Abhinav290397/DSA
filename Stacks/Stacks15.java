//Evaluate Postfix Expression.
package Stacks;
import java.util.*;
public class Stacks15 {
    public static int postfixEvaluation(String s,int n){
         Stack<Integer>st1 = new Stack<>();
         for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st1.push(ch - '0');
            }
            else{
                int operand1 = st1.pop();
                int operand2 = st1.pop();
                if(ch == '+')st1.push(operand2 + operand1);
                else if(ch == '-')st1.push(operand2 - operand1);
                else if(ch == '*')st1.push(operand2 * operand1);
                else if(ch == '/')st1.push(operand2 / operand1);
            } 
        }
        return st1.peek();     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(postfixEvaluation(str, n));
    }
}
