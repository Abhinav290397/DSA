//Extra Brackets(Refer portal)
package Stacks;
import java.util.*;
public class Stack02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        Stack<Character>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch!=')'){
                st1.push(ch);
            }
            else{ //means ch == ')'
                if(st1.peek()=='('){
                    System.out.println("extra brackets are there");
                    return;
                }
                else{
                    while(st1.peek()!='('){
                        st1.pop();
                    }
                    st1.pop();
                }
            }
        }
         System.out.println("No extra brackets");
    }
}
