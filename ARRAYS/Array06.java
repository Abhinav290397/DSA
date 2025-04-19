//Find the kth largest  element.
package ARRAYS;
import java.util.*;
public class Array06 {
    public static int findKthLargest(int arr[],int k){
        int n = arr.length;
        //Arrays.sort(arr);
        for(int i=0;i<k;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       int kthLargest = arr[n-k];
       return kthLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findKthLargest(arr, k);
        System.out.println(ans);
    }
}
