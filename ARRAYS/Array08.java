//Find the no. of subarrays divisible by k.
package ARRAYS;
import java.util.*;
public class Array08 {
   /*  public static int solve(int arr[],int k){ // O(n3)approach.
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int p=i;p<=j;p++){
                    sum += arr[p];
                }
                if(sum%k == 0)count++;
            }
        }
        return count;
    }*/
    public static int solve(int arr[],int k){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum%k == 0)count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solve(nums,k));
    }
}
