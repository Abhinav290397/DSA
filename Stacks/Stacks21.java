//Convert Prefix expression to Postfix.
package Stacks;
import java.util.*;
public class Stacks21 {
    public static String PrefixToPostfix(String s){
        int n = s.length();
        Stack<String>st1 = new Stack<>();
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String opd1 = st1.pop();
                String opd2 = st1.pop();
                String res = opd1+opd2+ch;
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
        System.out.println(PrefixToPostfix(str));
    }
}
