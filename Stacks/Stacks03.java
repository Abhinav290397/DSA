//Balanced Expression(portal).
package Stacks;
import java.util.*;

import javax.print.attribute.standard.Sides;
public class Stacks03 {

    public static char openBrac(char ch){
        if(ch == ')'){
            return '(';
        }
        else if(ch == '}'){
            return '{';
        }
        else{
            return '[';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        Stack<Character>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st1.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(st1.size() > 0 && st1.peek() == openBrac(ch)){
                    st1.pop();
                }
                else{
                    System.out.println("False");
                }
            }
        }
        if(st1.size() == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
