//Print the size of samllest possoble substring with k unique characters.
package SLIDINGwindow;
import java.util.*;
public class sw02 {
    public static int smallestSubStr(String s,int k){
        int n = s.length();
        int end=0;
        int start=0;
        int ans = Integer.MAX_VALUE;
        int unique = 0;
        int[]freq = new int[123];
        while(end < n){
            //1.expand
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] == 1)unique++;
            end++;
            while(start < end && unique == k){
                //2.calculation
                ans = Math.min(ans,(end - start));
                //3.contraction
                freq[s.charAt(start)]--;
                if(freq[s.charAt(start)] == 0)unique--;
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String str = sc.next();
        System.out.println(smallestSubStr(str, K));
    }
}
