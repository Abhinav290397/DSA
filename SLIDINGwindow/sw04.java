//Print the smallest substring with k unique characters.
package SLIDINGwindow;
import java.util.*;
public class sw04 {
    public static String solve(String s,int k){
        int n = s.length();
        int end = 0;
        int start=0;
        int unique=0;
        int ans = Integer.MAX_VALUE;
        int startIdx = -1;
        int endIdx = -1;
        int freq[] = new int[123];
        while(end < n){
            //1.expand
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] == 1)unique++;
            end++;
            while(start < end && unique == k){
                //2.calkulation
                if(ans > end - start){
                    ans = end - start;
                    startIdx = start;
                    endIdx = end;
                }
                //3.contract
                freq[s.charAt(start)]--;
                if(freq[s.charAt(start)] == 0)unique--;
                start++;
            }
        }
        if(startIdx == -1)return "";
        return s.substring(startIdx,endIdx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        System.out.println(solve(str, k));
    }
}
