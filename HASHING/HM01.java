package HASHING;
import java.util.*;
public class HM01 {
    public static void times(int arr[],int n){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        times(arr, n);
   } 
}
