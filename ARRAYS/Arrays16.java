//Rotate Array(Leetcode).(rotate array k times in right).
package ARRAYS;
import java.util.*;
public class Arrays16 {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int nums[],int k){
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotate(arr,k);
    }
}
