//[REFER DECEMBER LECTURES].
//Print the size of longest substring with k unique characters.
package SLIDINGwindow;
import java.util.*;
public class sw01 {
    public static int longestSubStr(String s,int k){
        int n = s.length();
        int end = 0;
        int start = 0;
        int ans = -1;
        int unique = 0;
        int[]freq = new int[123];
        while(end < n){
            //1.expand
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] == 1)unique++;
            end++;
            //2.contract
            while(start < end && unique > k){
                freq[s.charAt(start)]--;
                if(freq[s.charAt(start)] == 0)unique--;
                start++;
            }
            //3.Calculation
            if(unique == k){
                ans = Math.max(ans,(end - start));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String str = sc.next();
        System.out.println(longestSubStr(str, K));
    }
}
