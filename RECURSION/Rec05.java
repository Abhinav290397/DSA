//Fsctorial using recursion
package RECURSION;
import java.util.*;
public class Rec05 {
    public static int fact(int n){

        if(n==0){
            return 1;
        }
        int sAns = fact(n-1);
        int ans = n * sAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
