//Two Sum(portal)........This code works only for sorted array.
package TWO_POINTER;
import java.util.*;
public class TP01 {
    public static int[] twoSum(int[]arr,int target){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target){
                return new int[]{arr[i],arr[j]};
            }
            else if(arr[i]+arr[j] < target)i++;
            else if(arr[i]+arr[j] > target)j--; 
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetSum = sc.nextInt();
        int[]nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int []ans = twoSum(nums,targetSum);
        
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
