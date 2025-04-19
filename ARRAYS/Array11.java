//Stock Span Problem.
package ARRAYS;
import java.util.*;
public class Array11 {
   /*  public static int solve(int arr[],int n){ //O(n2).
        int maxProfit = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    } */
    public static int solve(int arr[],int n){
        int buyPrice = Integer.MAX_VALUE;          //O(n)
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] < buyPrice){
                buyPrice = arr[i];
            }
            else{
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solve(nums, n));
    }
}
