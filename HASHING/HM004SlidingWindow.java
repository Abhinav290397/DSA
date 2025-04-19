//Print longest Substring with k unique characters.
/*You are given a string 'str'.
You need to print longest possible substring that has exactly k -
-unique characters. If there is no such string print -1*/
/*Example:
Input
6 2
aabbcc

Output
aabb

Explanation
Max substring can be any one from {“aabb” , “bbcc”} */
package HASHING;
import java.util.*;

public class HM004SlidingWindow {
    public static String PrintLongestStr(String str,int n,int k){
        int start = 0;
        int end = 0;
        int unique = 0;
        int ans = -1;
        int ansStart = 0;
        int ansEnd = 0;
        int freq[] = new int [10001];
        while(end < n){
            freq[str.charAt(end)]++;
            if(freq[str.charAt(end)] == 1){
                unique++;
            }
            end++;

            while(start < end && unique > k){
                freq[str.charAt(start)]--;
                if(freq[str.charAt(start)] == 0){
                    unique--;
                }
                start++;
            }

            if(unique == k){
                if(ans < end - start){
                    ans = end - start;
                    ansStart = start;
                    ansEnd = end;
                }
            }
        }
        if(ansStart == -1){
            return "";
        }
        return str.substring(ansStart, ansEnd);
    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int k = sc.nextInt();
    System.out.println(PrintLongestStr(s, n, k));
  }
}
