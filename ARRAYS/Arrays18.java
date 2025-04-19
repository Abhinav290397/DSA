//Insert an element at the kth position/index in array.
package ARRAYS;
import java.util.*;
public class Arrays18 {
    public static void solve(int [] arr,int idx,int val){
        int n = arr.length;
        int ans[] = new int[n+1]; //we have to create new array.
        for(int i=0;i<=n;i++){
            if(i < idx){
                ans[i] = arr[i];
            }
            else if(i==idx){
                ans[i] = val;
            }
            else{
                ans[i] = arr[i-1];
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int idx = sc.nextInt();
        int key = sc.nextInt();
        solve(arr,idx,key);
    }
    
}
