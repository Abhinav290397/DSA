//Distinct Window.
//find the smallest substring with all distinct characters.
package SLIDINGwindow;
import java.util.*;
public class sw05 {
    public static String solve(String s,int k){
        int n = s.length();
        int end=0;
        int start=0;
        int unique=0;
        int ans = Integer.MAX_VALUE;
        int startIdx = -1;
        int endIdx = -1;
        int freq[] = new int[123];
        while(end < n){
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] == 1)unique++;
            end++;
            while(start < end && unique == k){
                if(ans > end - start){
                    ans = end - start;
                    startIdx = start;
                    endIdx = end;
                }
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
        String str = sc.next();
        int distinct = 0;
        int freq[] = new int[123];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
            if(freq[str.charAt(i)] == 1)distinct++;
        }
        String res = solve(str,distinct);
        System.out.println(res);
    }
}
