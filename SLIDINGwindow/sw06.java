//Minimum window Substring (refer portal);
package SLIDINGwindow;
import java.util.*;
public class sw06 {
    public static boolean satisfied(int[]sfreq,int[]tfreq){
        for(int i=0;i<123;i++){
            if(tfreq[i] > sfreq[i])return false;
        }
        return true;
    }
    public static String solve(String s,String t){
        int n = s.length();
        int end = 0;
        int start = 0;
        int startIdx = -1;
        int endIdx = -1;
        int ans = Integer.MAX_VALUE;
        int[]sfreq = new int[123];

        int []tfreq = new int[123];
        for(int i=0;i<t.length();i++){
            tfreq[t.charAt(i)]++;
        }
        while(end < n){
            sfreq[s.charAt(end)]++;
            end++;
            while(start < end && satisfied(sfreq,tfreq) == true){
                if(ans > end - start){
                    ans = end - start;
                    startIdx = start;
                    endIdx = end;
                }
                sfreq[s.charAt(start)]--;
                start++;
            }
        }
        if(startIdx == -1)return "";
        return s.substring(startIdx,endIdx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solve(s, t));
    }
}
