//Find the first and second smallest number.
package ARRAYS;
import java.util.*;
public class Array07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] < min2 && arr[i] > min1){
                min2 = arr[i];
            }
        }
        System.out.println(min1+" "+min2);
    }
}
