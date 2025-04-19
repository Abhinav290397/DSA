//Sorted Insert Position(refer portal);
package BINARY_SEARCH;
import java.util.*;
public class BS04 {
    public static int ceil(int arr[],int tar){
        int n = arr.length;

        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == tar){
                ans = mid;
                return mid;
            }
            else if(arr[mid] > tar){
                ans = mid;
                r = mid-1;
            }
            else if(arr[mid] < tar){
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
        System.out.println(ceil(arr,target));
    }
}
