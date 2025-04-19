//Adaptive Bubble sort Algo.
package SORTING;
import java.util.*;
public class sort02 {
    public static void adaptiveBubbleSort(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-1-i;j++){  //In this the worst case TC is still O(n2) but if given array is already
                if(arr[j] > arr[j+1]){ //sorted then its TC will be O(n).
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag == false)break;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        adaptiveBubbleSort(arr, n);
    }
}
