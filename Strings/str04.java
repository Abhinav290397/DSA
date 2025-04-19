//Shuffle String.
package Strings;
import java.util.*;
public class str04 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int indices[] = new int[n];
    for(int i=0;i<n;i++){
        indices[i] = sc.nextInt();
    }
    char []arr = new char[n];
    for(int i=0;i<n;i++){
      char ch = s.charAt(i);
      arr[indices[i]] = ch;
    }
    String ans = "";
    for(int i=0;i<n;i++){
        ans += arr[i];
    }
    System.out.println(ans);
   } 
}
