//Convert infix to postfix.
package Stacks;
import java.util.*;
public class Stacks18 {
    public static int precedence(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch=='/'||ch=='*'){
            return 2;
        }
        else if(ch=='+'||ch=='-'){
            return 1;
        }
        return -1;
    }
    public static String infixToPostfix(String s,int n){
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
                while(st1.size()>0 && precedence(st1.peek()) >= precedence(ch)){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(infixToPostfix(str, n));
    }
}
