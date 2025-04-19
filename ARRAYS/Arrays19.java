//Insert an element at the kth position/index in given array.(If there is already an empty index in the array).

package ARRAYS;
import java.util.*;
public class Arrays19 {
    public static void solve(int[]arr,int idx,int val){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i == idx){
                int j=n-1;
                while(j>idx){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[i] = val;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int key = sc.nextInt();

        solve(arr, idx, key);
    }
}
