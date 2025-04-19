//Count 1 in sorted binary array(portal).
package BINARY_SEARCH;
import java.util.*;
public class BS03 {
    public static int count_1(int arr[]){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == 1){
                ans = mid;
                l = mid+1;
            }
            else if(arr[mid] == 0){
                r = mid-1;
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
        int res = count_1(arr);
        System.out.println(res+1);
    }
}
