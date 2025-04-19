//Sum of n natural no. using recursion.
package RECURSION;
import java.util.*;
public class Rec04 {
    public static int printSum(int n){

        if(n==0){
            return 0;
        }
        int sAns = printSum(n-1);
        int ans = n+ sAns;
        return ans;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(printSum(n));
  }  
}
