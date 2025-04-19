/*Record Values
Alex gave Alice to keep scores for a game,with strange rules. At the beginning of the game,record is empty.

A list of strings operation has been given, where each operation[i] is the ith operation Alice must apply.

1.) An integer x , add number to x to record.
2.) + Record a new score that is the sum of the previous two scores
3.) D Record a new score that is the double of the previous score
4.) C Record a new score that is the double of the previous score

Alice task is to return the sum of all the record after applying all the operations.

Input Format
The first line of input contains a single integer n.

The second line of imput contains n space strings.

Output Format
Return the sum after applying all the operations.

Example 1:

Input
5
5 2 C D +

Output
30
Explanation
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.*/

package Stacks;
import java.util.*;
public class Stacks04 {
    public static int solution(String arr[],int n){
        Stack<Integer> st1 = new Stack<>();
        for(int i=0;i<n;i++){
            String str = arr[i];
            if(str.equals("C")){
                st1.pop();
            }
            else if(str.equals("D")){
                int a = 2 * st1.peek();
                st1.push(a);
            }
            else if(str.equals("+")){
                int b = st1.pop();
                int c = b + st1.peek();
                st1.push(b);
                st1.push(c);
            }
            else{
                st1.push(Integer.parseInt(str));
            }
        }
        int maxScore = 0;
        while(!st1.empty()){
            maxScore = maxScore + st1.pop();
        }
        return maxScore;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr [] = new String[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.next();
    }
    System.out.println(solution(arr, n));
   } 
}
