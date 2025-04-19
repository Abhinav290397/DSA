/*You are given a string s.
Your task is to find the smallest window of string with all distinct characters-
 -of the given string.

Output Format
Return the smallest substring with all distinct characters of given string.

Example 1:
Input:
aabcbcdbca
Output:
dbca

Explanation
Possible substrings= {aabcbcd, abcbcd, 
bcdbca, dbca....}
Of the set of possible substrings 'dbca' 
is the shortest substring having all the 
distinct characters of given string.

Example 2:
Input:
aaab
Output:
ab

Explanation
Possible substrings={aaab, aab, ab}
Of the set of possible substrings 'ab' 
is the shortest substring having all 
the distinct characters of given string. */


package HASHING;
import java.util.*;
public class HM06SlidingWindow {
     /*public static int findDistinctChar(String s, int n){
        int distinct = 0;
        int freq[] = new int[123];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
           if(freq[s.charAt(i)] == 1){
            distinct++;
           }
        }
        
        return distinct;
    }*/
    public static String SmallestDistintChrStr( String s,int n,int k){
        //int k = findDistinctChar(s, n);
        int end = 0;
        int start = 0;
        int unique = 0;
        int freq[] = new int[123];
        int ans = Integer.MAX_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        while(end < n){
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] == 1){
                unique++;
            }
            end++;

            while(start < end && unique == k){
                if(ans > end - start){
                    ans = end - start;
                    ansStart = start;
                    ansEnd = end;
                }
                freq[s.charAt(start)]--;
                if(freq[s.charAt(start)] == 0){
                    unique--;
                }
                start++;
            }
        }
        if(ansStart == -1){
            return "";
        }
        return s.substring(ansStart, ansEnd);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int distinct = 0;
        int freq[] = new int[123];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
           if(freq[s.charAt(i)] == 1){
            distinct++;
           }
        }
       // System.out.println(s,n);
    System.out.println(SmallestDistintChrStr(s,n,distinct));
   } 
}


