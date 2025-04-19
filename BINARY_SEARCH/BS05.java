//Find First and Last Occurrence/Position of Element in Sorted Array(Leetcode)
package BINARY_SEARCH;
import java.util.*;
public class BS05 {
    public static int lastOccurrence(int arr[],int target){
        int n = arr.length;

        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                ans = mid;
                l = mid+1;
            }
            else if(arr[mid] > target){
                r = mid-1;
            }
            else if(arr[mid] < target){
                l = mid+1;
            }
        }
        return ans;
    }
    public static int firstOccurrence(int arr[],int target){
        int n = arr.length;

        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                ans = mid;
                r = mid-1;
            }
            else if(arr[mid] > target){
                r = mid-1;
            }
            else if(arr[mid] < target){
                l = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        int ans[] = new int[]{first,last};
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
