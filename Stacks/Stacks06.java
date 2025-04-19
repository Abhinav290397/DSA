//Balanced Brackets..(Portal).
package Stacks;
import java.util.*;
public class Stacks06 {
    public static void balanceBracket(String str,int n){
        Stack<Character>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('|| ch=='{' || ch=='['){
                st1.push(ch);
            }
            else{
                if(!st1.empty() && st1.peek() == openForClose(ch)){
                    st1.pop();
                }
                else{
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        if(st1.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
    public static char openForClose(char ch){
        if(ch == ')')return '(';
        else if(ch == '}')return '{';
        else if(ch == ']')return '[';
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        balanceBracket(str, n);

    }
}
