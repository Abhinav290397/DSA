//Longest Substring Without Repeating Characters.(Leetcode).
/*Given a string s, find the length of the longest-
-substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1. */

package HASHING;
import java.util.*;
public class HM007SlidingWindow {
    public static int findStrLength(String s,int n){
        int end = 0;
        int start = 0;
        int len =0;
        int repeat = 0;
        int freq[] = new int [256];

        while(end < n){
            freq[s.charAt(end)]++;
            if(freq[s.charAt(end)] > 1){
                repeat++;
            }
            end++;
            while(start < end && repeat > 0){
                if(freq[s.charAt(start)] > 1){
                    repeat--;
                }
                freq[s.charAt(start)]--;
                start++;
            }
            len = Math.max(len,end-start);
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        System.out.println(findStrLength(s, n));

    }
}

