//To check wheather an array is pelindromic or not.
package ARRAYS;
import java.util.*;
public class Array05 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j= n-1;
        boolean flag = false;
        while(i<j){
            if(arr[i] == arr[j]){
                flag = true;
            }
            i++;
            j--;
        }
        if(flag == true)System.out.println("palindrome");
        else System.out.println("not palindromic");
   } 
}
