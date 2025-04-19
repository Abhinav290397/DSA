//Print in decreasing as well as increasing order using recursion
package RECURSION;
import java.util.*;
public class Rec03 {
    public static void printDecInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printDecInc(n);
   } 
}
 