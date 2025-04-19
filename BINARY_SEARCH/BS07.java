// Find Minimum in Rotated Sorted Array(Leetcode)
package BINARY_SEARCH;
import java.util.*;
public class BS07 {
    public static int findMin(int arr[]){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > arr[r]){
                l = mid+1;
            }
            else if(arr[mid] < arr[r]){
                r = mid;
            }
            else if(arr[mid] == arr[r]){
                ans = arr[mid];
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Ans = findMin(arr);
        System.out.println(Ans);
    }
}
