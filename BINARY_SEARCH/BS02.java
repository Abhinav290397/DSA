//floor ans ceil(portal).
package BINARY_SEARCH;
import java.util.*;
public class BS02 {
    public static int floor(int arr[],int target){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                return ans;
            }
            else if(arr[mid] < target){
                ans = arr[mid];
                l = mid+1;
            }
            else if(arr[mid] > target){
                r = mid-1;
            }
        }
        return ans;
    }
    public static int ceil(int arr[],int target){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                return ans;
            }
            else if(arr[mid] > target){
                ans = arr[mid];
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
        int f = floor(arr,target);
        int c = ceil(arr,target);
        System.out.println(f+" "+c);
    }
}
