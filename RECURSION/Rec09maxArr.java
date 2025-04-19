//Find the largest element in array using recursion.
package RECURSION;
import java.util.*;
public class Rec09maxArr {
    public static int largestElement(int idx,int arr[]){
        if(idx==arr.length){
            return 0;
        }
       int sAns = largestElement(idx+1,arr);
       int ans = Math.max(arr[idx], sAns);
       return ans;
       
        /*  int sAns = largestElement(idx+1,arr);
        int ans = 0;
        if(sAns > arr[idx]){
            ans = sAns;
        }
        else{
            ans = arr[idx];
        }
        return ans;*/
    }
   public static void main(String[] args) {
    int idx = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(largestElement(idx,arr));
   } 
}
