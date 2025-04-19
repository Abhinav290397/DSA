//Search in Bitonic Array.(portal)(find the given target in bitonic array).
package BINARY_SEARCH;
import java.util.*;
public class BS09 {
    public static int BSforIncreasing(int arr[],int tar,int l,int r){
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == tar){
                ans = mid;
                return ans;
            }
            else if(arr[mid] > tar){
                r = mid-1;
            }
            else if(arr[mid] < tar){
                l = mid+1;
            }
        }
        return ans;
    }
    public static int BSforDecreasing(int arr[],int tar,int l,int r){
        int ans = -1;
        int mid = (l+r)/2;
        while(l<=r){
        if(arr[mid] == tar){
            ans = mid;
            return mid;
        }
        else if(arr[mid] > tar){
            l = mid+1;
        }
        else if(arr[mid] < tar){
            r = mid-1;
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
        int l=0;
        int r = n-1;
        int ans = -1;

        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                ans = mid;
                break;
            }
            else if(arr[mid] < arr[mid+1]){
                l = mid+1;
            }
            else if(arr[mid] < arr[mid-1]){
                r = mid-1;
            }
        }
        int search01 = BSforIncreasing(arr,target,0,ans);
        int search02 = BSforDecreasing(arr,target,ans,n-1);

        if(search01 == -1)System.out.println(search02);
        else System.out.println(search01);
    }
}
