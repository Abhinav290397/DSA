//Evaluate infix expression.
/*Approach is...
Convert infix expression into postfix expression(as done in previous program) and-
-then evaluate that postfix expression(it will be same as that of evaluating an infix
-expression)-
In this approach there is no need of remembering extra code.*/
package Stacks;
import java.util.*;
public class Stacks19 {
    public static int prece(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch=='/'||ch=='*'){
            return 2;
        }
        else if(ch=='-'||ch=='+'){
            return 1;
        }
        return -1;
    }
    public static String convertInfixToPostfix(String s){
        Stack<Character>st1 = new Stack<>();
        int n = s.length();
        String res = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res = res + ch;
            }
            else if(ch == '('){
                st1.push(ch);
            }
            else if(ch == ')'){
                while(st1.size()>0 && st1.peek()!='('){
                    res = res + st1.peek();
                    st1.pop();
                }
                st1.pop();
            }
            else{
                while(st1.size()>0 && prece(st1.peek()) >= prece(ch)){
                    res = res + st1.peek();
                    st1.pop();
                }
                st1.push(ch);
            }
        }
        while(st1.size()>0){
            res = res + st1.peek();
            st1.pop();
        }
        return res;
    }
    public static int evaluate_Postfix(String postfixExp){
        Stack<Integer>st1 = new Stack<>();
        int n = postfixExp.length();
        for(int i=0;i<n;i++){
            char ch = postfixExp.charAt(i);
            if(Character.isDigit(ch)){
                st1.push(ch-'0');
            }
            else{
                int opd1 = st1.pop();
                int opd2 = st1.pop();
                if(ch == '+')st1.push(opd2+opd1);
                else if(ch == '-')st1.push(opd2-opd1);
                else if(ch == '*')st1.push(opd2*opd1);
                else if(ch == '/')st1.push(opd2/opd1);
            }
        }
        return st1.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String postfixExp = convertInfixToPostfix(str);
        System.out.println(evaluate_Postfix(postfixExp));
    }
}
