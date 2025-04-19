//Single Number.(In array every no. appears twice except one..find that no.)
import java.util.*;
public class BM06 {
    public static int solve(int nums[],int n){
        int res = 0;
        for(int i=0;i<n;i++){
            res = res^nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr,n));
    }
}
