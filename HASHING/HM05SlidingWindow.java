//Find the no. of distinct characters in a string.
package HASHING;
import java.util.*;
public class HM05SlidingWindow {
    public static int distinctChr(String s,int n){
        int distinct  = 0;
        int freq [] = new int[1001];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
            if(freq[s.charAt(i)] == 1){
                distinct++;
            }
        }
        return distinct;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String st = sc.next();
       int n = st.length();
       System.out.println(distinctChr(st, n));
    }
}
