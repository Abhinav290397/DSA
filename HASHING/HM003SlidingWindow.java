// Print smallest Substring with k unique characters.
/*You are given a string 's'.
You need to print the smallest possible substring that has exactly k -
-unique characters.*/
/*Example:
Input
6 2
aabbcc

Output
 ab */
package HASHING;
import java.util.*;
public class HM003SlidingWindow {
    public static String PrintSmallestStr(String str,int n,int k){
        int start = 0;
        int end = 0;
        int unique = 0;
        int ans = Integer.MAX_VALUE;
        int freq[] = new int [100001];
        int ansStart = 0;
        int ansEnd = 0;

        while(end < n){
            freq[str.charAt(end)]++;
            if(freq[str.charAt(end)] == 1){
                unique++;
            }
            end++;

            while(start < end && unique == k){
                if(ans > end - start){
                    ans = end - start;
                    ansStart = start;
                    ansEnd = end;
                }
                freq[str.charAt(start)]--;
                if(freq[str.charAt(start)] == 0){
                    unique--;
                }
                start++;
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
        System.out.println(PrintSmallestStr(s, n, k));
    }
}
