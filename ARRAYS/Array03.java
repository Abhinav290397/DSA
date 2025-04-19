//Find the 2nd maximum in array.
package ARRAYS;
import java.util.*;
public class Array03 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i] > max1){
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1){
            max2 = arr[i];
        }
    }
    System.out.println(max1+" "+max2);
 }   
}
