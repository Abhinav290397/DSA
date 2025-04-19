//print array in reverse using recursion.
package RECURSION;
import java.util.*;
public class Rec08ArrRev {
    public static void reverseArr(int idx,int arr[]){
        if(idx==arr.length){
            return;
        }
        reverseArr(idx+1,arr);
        System.out.print(arr[idx]+" ");
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArr(idx,arr);
    }
}
