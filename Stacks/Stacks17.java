//Convert Postfix to prefix.
package Stacks;
import java.util.*;
public class Stacks17 {
    public static String postfixToPrefix(String s,int n){
        Stack<String>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String opd1 = st1.pop();
                String opd2 = st1.pop();
                String res = ch + opd2 + opd1;
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
        System.out.println(postfixToPrefix(str, n));
    }
}
