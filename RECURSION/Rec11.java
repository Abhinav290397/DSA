//Find last index of target element using recursion.
package RECURSION;
import java.util.*;
public class Rec11 {
    public static int lastIndex(int idx , int arr[],int target){
        if(idx == arr.length){
            return -1;
        }
        int zAns = lastIndex(idx+1,arr,target);
        int ans = 0;
        if(zAns == -1){
            if(arr[idx]==target){
                ans = idx;
            }
            else{
                ans = zAns;
            }
        }
        else{
            ans = zAns;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int target = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(lastIndex(idx,arr,target));
    }
}
