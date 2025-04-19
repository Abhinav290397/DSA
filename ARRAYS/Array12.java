//Maximum consecutive ones.(Leetcode 485)
package ARRAYS;
import java.util.*;
public class Array12 {
    public static int solve(int arr[],int n){
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
                ans = Math.max(ans,count);
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solve(nums,n));
    }
}
