//Convert infix expression to prefix.
//Approach is.....
/*First convert infix expression into postfix expression and then convert that postfix expression to-
 prefix expression.
By this method we convert infix to prefix */
package Stacks;
import java.util.*;
public class Stacks20 {
    public static int prece(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='*'||ch=='/'){
            return 2;
        }
        else if(ch=='+'||ch=='-'){
            return 1;
        }
        return -1;
    }
    public static String InfixToPostfix(String s){
        int n = s.length();
        Stack<Character> st1 = new Stack<>();
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
    public static String PostfixToPrefix(String s){
        int n = s.length();
        Stack<String>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String opd1 = st1.pop();
                String opd2 = st1.pop();
                String res = ch+opd2+opd1;
                st1.push(res);
            }
            else{
                st1.push(ch+"");
            }
        }
        return st1.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        String postfixExp = InfixToPostfix(str);
        System.out.println(PostfixToPrefix(postfixExp));
    }
}
