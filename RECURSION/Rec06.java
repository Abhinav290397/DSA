//WAP to find x to the power n using recursion.
package RECURSION;
import java.util.*;
public class Rec06 {
    public static int printpower(int x,int n){
           if(n==0){
            return 1;
           }
            int sAns = printpower(x,n-1);
            int ans = x * sAns;
            return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(printpower(x,n));
    }
}
