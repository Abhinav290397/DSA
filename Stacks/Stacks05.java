/*Print Bracket Number
Given a string s, your task is to find the bracket numbers. The bracket numbers are the same numbers given to corresponding opening and closing brackets.

Input Format
The first line of input conatains string s.

Output Format
Your task is to find the bracket number.

Example 1
Input

(aa(bdc))p(dee)â€
Output

1 2 2 1 3 3
Explanation

The brackets have been assigned 1 2 2 1 3 3.

Example 2
Input

(((()(
Output

1 2 3 4 4 5
Explanation

The highlighted brackets in the given string (((()( has been assigned the numbers as: 1 2 3 4 4 5 */
package Stacks;
import java.util.*;
public class Stacks05 {
    public static ArrayList<Integer> countBracket(String str,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();
        int count = 1;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                ans.add(count);
                st1.push(count);
                count++;
            }
            else if(ch == ')'){
               ans.add(st1.pop());
            }
            else{
                continue;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(countBracket(str, n));
    }
}
