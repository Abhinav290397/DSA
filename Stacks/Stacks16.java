//Convert postfix to infix.
package Stacks;
import java.util.*;
public class Stacks16 {
    public static String postfixToInfix(String s,int n){
        Stack<String>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String opd1 = st1.pop();
                String opd2 = st1.pop();
                String res = "("+opd2+ch+opd1+")";
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
        String str = sc.next();
        int n = str.length();
        System.out.println(postfixToInfix(str, n));
    }
}

