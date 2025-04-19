// Remove Duplicate Letters(Refer LeetCode - 316)
package Strings;
import java.util.*;
public class str06 {
    public static String solve(String s){
        int n = s.length();
        int freq[] = new int[123];
        boolean visited[] = new boolean[123];
        Stack<Character>st1 = new Stack<>();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
            if(visited[ch-'a'] == true)continue;
            while(st1.size() > 0 && ch < st1.peek() && freq[st1.peek()-'a'] > 0){
                char remove = st1.pop();
                visited[remove-'a'] = false;
            }
            st1.push(ch);
            visited[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(st1.size() > 0){
            sb.append(st1.pop());
        }
        sb = sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solve(str));

    }
}
