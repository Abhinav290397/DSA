//Longest Substring with k unique characters.

/*You are given a string 'str'.
You need to print length of longest possible substring that has exactly k -
-unique characters. If there is no such string print -1*/
/*Example:
Input
6 2
aabbcc

Output
4

Explanation
Max substring can be any one from {“aabb” , “bbcc”} */
package HASHING;
import java.util.*;
public class HM001SlidingWindow {
    public static int longestSubStr(String str,int n,int k){
        int start = 0;
        int end = 0;
        int ans = -1;
        int unique = 0;
        int frequency[] = new int[100001];
        while(end < n){
            frequency[str.charAt(end)]++;
            if(frequency[str.charAt(end)] == 1){
                unique++;
            }
            end++;

            while(start < end && unique > k){
                frequency[str.charAt(start)]--;
                if(frequency[str.charAt(start)] == 0){
                    unique--;
                }
                start++;
            }

            if(unique == k){
                ans = Math.max(ans,(end - start));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int k = sc.nextInt();
        System.out.println(longestSubStr(str, n, k));
    }
}
