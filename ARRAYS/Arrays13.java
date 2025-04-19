//Rotate the array by one position in right.
package ARRAYS;
import java.util.*;
public class Arrays13 {
    public static void rotate(int arr[],int n){
        int a = arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = a;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        rotate(nums, n);
   } 
}
