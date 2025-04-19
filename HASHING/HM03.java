//First Element to Occur K Times in an array(portal).
//*** BY USING COUNT ARRAY.***
package HASHING;
import java.util.*;
public class HM03 {
    public static int/*(void) */ solve(int arr[],int n,int k){
        int count[] = new int[1000001];
        for(int i=0;i<n;i++){
            count[arr[i]]++;          //means count array ka element increased by 1.
            if(count[arr[i]]==k){     // count array ka element k ke barabar ho jaaye
            //System.out.println(arr[i]);
                return arr[i];
            }
        }
        //System.out.println(-1);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //solve(arr, n, k);
       System.out.println(solve(arr, n, k));
    
    }
}
