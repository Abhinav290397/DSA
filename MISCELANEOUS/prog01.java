//Implement Math.pow(x,n) function .(leetcode-->52.Pow(x,n))   (x ki power n).
package MISCELANEOUS;
import java.util.*;
public class prog01 {
    public static int findPower(int x,int n){
        int res = 1;
        while(n > 0){
            if(n%2 == 1){
                res = res *x;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        if(n == 0)System.out.println(1);
        if(n < 0){ //for -ve powers.
            x = 1/x;
            int N = -(n);
             ans =  findPower(x,N);
            System.out.println(ans);
            return;
        }
        ans = findPower(x,n);
        System.out.println(ans);
    }
}
