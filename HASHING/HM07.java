//Subarray sum divisible by k
package HASHING;
import java.util.*;
public class HM07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int [n];
                for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
               /* int count = 0;
                for(int i=0;i<n;i++){
                        int sum =0;
                        for(int j=i;j<n;j++){
                                sum =sum + arr[j];
                        if(sum%k==0){
                                count++;
                        }
                }
        }
                System.out.println(count);*/
    }
}
