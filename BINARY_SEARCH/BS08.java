// Search in Rotated Sorted Array(LeetCode).
package BINARY_SEARCH;
import java.util.*;
public class BS08 {
    public static int BinarySearch(int arr[],int tar,int l,int r){
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
    public static int findMin(int arr[]){
        int n = arr.length;

        int l=0;
        int r=n-1;
        int minIdx = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > arr[r]){
                l = mid+1;
            }
            else if(arr[mid] < arr[r]){
                r = mid;
            }
            else if(arr[mid] == arr[r]){
                minIdx = mid;
                return minIdx;
            }
        }
        return minIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pivotIdx = findMin(arr);

        int search01 = BinarySearch(arr,target,0,pivotIdx-1);
        int search02 = BinarySearch(arr,target,pivotIdx,n-1);

        if(search01 == -1){
            System.out.println(search02);
        }
        else{
            System.out.println(search01);
        }
    }
}
