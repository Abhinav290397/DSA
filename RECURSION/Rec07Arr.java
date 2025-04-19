//Print an array using the recursion.
package RECURSION;
import java.util.*;
public class Rec07Arr {
    public static void printArr(int idx,int arr[]){
        if(idx==arr.length){
           return;
        }
        System.out.print(arr[idx]+" ");
        printArr(idx+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx=0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       printArr(idx,arr);
    }
}
