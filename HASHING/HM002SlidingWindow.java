// Smallest Substring with k unique characters.
/*You are given a string 's'.
You need to print length of smallest possible substring that has exactly k -
-unique characters.*/
/*Example:
Input
6 2
aabbcc

Output
2

Explanation
Max substring can be any one from {“ab” , “bc”} */ 
package HASHING;
import java.util.*;
public class HM002SlidingWindow {
    public static int smallestSubStr(String str,int n,int k){
        int start = 0;
        int end = 0;
        int unique = 0;
        int ans = Integer.MAX_VALUE;
        int frequency[] = new int[100001];
        while(end < n){
            frequency[str.charAt(end)]++;
            if(frequency[str.charAt(end)]==1){
                unique++;
            }
            end++;

            while(start < end && unique == k){
                ans = Math.min(ans,(end - start));
                frequency[str.charAt(start)]--;
                if(frequency[str.charAt(start)]==0){
                    unique--;
                }
                start++;
            }
        }
        return ans;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int k = sc.nextInt();
    System.out.println(smallestSubStr(s, n, k));
  }  
}
